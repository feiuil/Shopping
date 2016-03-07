package com.uil.administrator.shopping.util;

/**
 * 常量接口
 */
public interface Constants {
    interface URL {

        /**
         * 首页（图片ViewPager ，九块九、十九块九）
         */
        String PATH_HOMTPAGE = "http://api.wanggouchao.com/index.php?g=api2&m=indexall&a=head2&source=wgc_android&access_token=";

        /*
        *九块九详情
        */
        String JIUKUAIJIU_DATAILS="http://api.wanggouchao.com/index.php?g=api2&m=search&a=scates3&source=wgc_android&cid=11&type=all&offset=0&order=0&limit=20&access_token=";
        /*
        *十九块九详情
        */
        String SHIJIUKUAIJIU_DATAILS="http://api.wanggouchao.com/index.php?g=api2&m=search&a=scates3&source=wgc_android&cid=13&type=all&offset=0&order=0&limit=20&access_token=";
        /**
         * 首页女神新装
         */
        String HOMEPAGEVIEWPAGER = "http://api.wanggouchao.com/index.php?g=api2&m=special&a=tidecheap6&source=wgc_android&limit=30&offset=0&special_id=1239&access_token=\n";

        /**
         * 首页SCrollView详情
         * 图片id：
         * 潮流服装--4
         * 鞋包配饰--5
         * 个护化妆--7
         * 食品--8
         * 数码--3
         * 母婴--6
         * 其他--9
         */

        String HEOMPAGE_SCOLL="http://api.wanggouchao.com/index.php?g=api2&m=search&a=scates3&source=wgc_android&cid=%d&type=all&offset=0&order=0&limit=20&access_token=";


        /**
         * 首页 ListView
         * %d : 填写页数
         */

        String HOMEPAGE_LISTVIEW = "http://api.wanggouchao.com/index.php?g=api2&m=indexall&a=recommend2&source=wgc_android&limit=%d&offset=0&access_token=";

        /**
         * 品牌特卖页面的接口
         * 今日特卖---cid=0
         * 居家---cid=12
         * 童装---cid=13
         * 鞋包---cid=14
         * 服装---cid=15
         * 个户---cid=11
         * 数码---cid=9
         */
        String BRAND_SALE = " http://api.wanggouchao.com/index.php?g=api2&m=special&a=speclist&source=wgc_android&cid=%d&limit=20&offset=0&access_token=";

        /**
         * 品牌特卖详情页面ListView
         * %d用nextID即可
         */
        String BRAND_SALE_DATEILS = "http://api.wanggouchao.com/index.php?g=api2&m=special&a=tidecheap6&source=wgc_android&limit=30&offset=0&special_id= %d &access_token=";


        //未知
        //http://api.wanggouchao.com/index.php?g=api2&m=index&a=tips&source=wgc_android&access_token=

        /**
         * 分享链接
         */

        //http://offlintab.firefoxchina.cn/data/sites.json
        /**
         * 苹果商城等链接
         */
        // http://offlintab.firefoxchina.cn/data/master-ii/defaultdials-0.j
        /**
         * {
         "status": 1,
         "msg": "success",
         "data": {
         "tips": [
         "每天早上八点准时更新商品,你一定要来看哟~",
         "所有商品经过编辑们精挑细选,请放心购买!",
         "购物时请登录淘宝或天猫账号,更安全更方便!",
         "如有问题请反馈给客服妹子,她会第一时间联系你哒~",
         "还记得你第一次网购的商品吗？",
         "持家有道省钱有理,从网购潮开始!!"
         ]
         }
         }
         */

    }
}
