package cn.ztuo.bitrade.controller.system;

import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.BooleanExpression;
import cn.ztuo.bitrade.annotation.AccessLog;
import cn.ztuo.bitrade.constant.AdminModule;
import cn.ztuo.bitrade.constant.PageModel;
import cn.ztuo.bitrade.controller.BaseController;
import cn.ztuo.bitrade.entity.Announcement;
import cn.ztuo.bitrade.service.AnnouncementService;
import cn.ztuo.bitrade.service.LocaleMessageSourceService;
import cn.ztuo.bitrade.util.MessageResult;
import cn.ztuo.bitrade.util.PredicateUtils;

import cn.ztuo.bitrade.entity.QAnnouncement;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


/**
 * @author GS
 * @description 公告
 * @date 2018/3/5 15:25
 */
@RestController
@RequestMapping("system/announcement")
public class AnnouncementController extends BaseController {
    @Autowired
    private AnnouncementService announcementService;
    @Autowired
    private LocaleMessageSourceService messageSource;

    @RequiresPermissions("system:announcement:create")
    @PostMapping("create")
    public MessageResult create(
            @RequestParam String title,
            @RequestParam String content,
            @RequestParam("isShow") Boolean isShow,
            @RequestParam(value = "imgUrl", required = false) String imgUrl) {
        Announcement announcement = new Announcement();
        announcement.setTitle(title);
        announcement.setContent(content);
        announcement.setIsShow(isShow);
        announcement.setImgUrl(imgUrl);
        announcementService.save(announcement);
        return success(messageSource.getMessage("SUCCESS"));
    }

    /**
     * 公告置顶
     * @param id
     * @return
     */
    @RequiresPermissions("system:announcement:top")
    @PostMapping("top")
    @AccessLog(module = AdminModule.CMS, operation = "公告置顶")
    public MessageResult toTop(@RequestParam("id")long id){
        Announcement announcement = announcementService.findById(id);
        int a = announcementService.getMaxSort();
        announcement.setSort(a+1);
        announcement.setIsTop("0");
        announcementService.save(announcement);
        return success(messageSource.getMessage("SUCCESS"));
    }


    /**
     * 取消公告置顶
     * @param id
     * @return
     */
    @RequiresPermissions("system:announcement:dwon")
    @PostMapping("down")
    @AccessLog(module = AdminModule.CMS, operation = "公告取消置顶")
    public MessageResult toDown(@RequestParam("id")long id){
        Announcement announcement = announcementService.findById(id);
        announcement.setIsTop("1");
        announcementService.save(announcement);
        return success();
    }

    /**
     * 分页查询公告
     * @param pageModel
     * @param isShow
     * @return
     */
    @RequiresPermissions("system:announcement:page-query")
    @GetMapping("page-query")
    public MessageResult page(
            PageModel pageModel,
            @RequestParam(required = false) Boolean isShow) {
        //条件
        ArrayList<BooleanExpression> booleanExpressions = new ArrayList<>();
        if (isShow != null) {
            booleanExpressions.add(QAnnouncement.announcement.isShow.eq(isShow));
        }
        Predicate predicate = PredicateUtils.getPredicate(booleanExpressions);
        Page<Announcement> all = announcementService.findAll(predicate, pageModel.getPageable());
        return success(all);
    }

    /**
     * 删除公告
     * @param ids
     * @return
     */
    @RequiresPermissions("system:announcement:deletes")
    @PatchMapping("deletes")
    public MessageResult deleteOne(@RequestParam("ids") Long[] ids) {
        announcementService.deleteBatch(ids);
        return success();
    }

    /**
     * 公告详情
     * @param id
     * @return
     */
    @RequiresPermissions("system:announcement:detail")
    @GetMapping("{id}/detail")
    public MessageResult detail(
            @PathVariable Long id) {
        Announcement announcement = announcementService.findById(id);
        Assert.notNull(announcement, "validate id!");
        return success(announcement);
    }

    /**
     * 更新公告
     * @param id
     * @param title
     * @param content
     * @param isShow
     * @param imgUrl
     * @return
     */
    @RequiresPermissions("system:announcement:update")
    @PutMapping("{id}/update")
    public MessageResult update(
            @PathVariable Long id,
            @RequestParam String title,
            @RequestParam String content,
            @RequestParam Boolean isShow,
            @RequestParam(value = "imgUrl", required = false) String imgUrl) {
        Announcement announcement = announcementService.findById(id);
        Assert.notNull(announcement, "validate id!");
        announcement.setTitle(title);
        announcement.setContent(content);
        announcement.setIsShow(isShow);
        announcement.setImgUrl(imgUrl);
        announcementService.save(announcement);
        return success();
    }

    /**
     * 不显示公告
     * @param id
     * @return
     */
    @RequiresPermissions("system:announcement:turn-off")
    @PatchMapping("{id}/turn-off")
    public MessageResult turnOff(@PathVariable Long id) {
        Announcement announcement = announcementService.findById(id);
        Assert.notNull(announcement, "validate id!");
        announcement.setIsShow(false);
        announcementService.save(announcement);
        return success();
    }

    /**
     * 显示公告
     * @param id
     * @return
     */
    @RequiresPermissions("system:announcement:turn-on")
    @PatchMapping("{id}/turn-on")
    public MessageResult turnOn(@PathVariable("id") Long id) {
        Announcement announcement = announcementService.findById(id);
        Assert.notNull(announcement, "validate id!");
        announcement.setIsShow(true);
        announcementService.save(announcement);
        return success();
    }

}
