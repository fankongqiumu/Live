package org.live.module.home.listener;

import org.live.module.login.domain.MobileUserVo;

/**
 * 主页活动窗口事件回调，用于在fragment调用activity中的方法或事件
 * Created by KAM on 2017/4/15.
 */

public interface OnHomeActivityEventListener {
    /**
     * 注销登陆状态
     */
    public void logout();

    /**
     * 取得用户数据
     */
    public MobileUserVo getUserData();

    /**
     * 退出应用
     */
    public void exit();

    /**
     * 从相册选择头像
     */
    public void chooseImgFromGallery(int flag);

    /**
     * 拍摄头像
     */
    public void chooseImgFromCamera(int flag, String fileName);

    /**
     * 替换直播模块的fragment
     */
    public void replaceLiveFragment();

    /**
     * 刷新视图
     */
    public void refreshFragment();

    /**
     * 检查直播间是否被禁播
     */
    public void checkLiveRoomIsBan();
}
