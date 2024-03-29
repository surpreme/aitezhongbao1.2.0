package com.aite.mainlibrary.Mainbean;

import com.lzy.basemodule.bean.ErrorBean;

import java.io.Serializable;
import java.util.List;

public class RecyChoiceUIBean extends ErrorBean implements Serializable {

    /**
     * status : 0
     * goods_list : [{"goods_id":"13","goods_name":"助餐商品","goods_short_title":"经典萝卜拌饭+萝卜酱+清蒸水蛋11","goods_price":"0.01","goods_promotion_price":"0.01","goods_shipping_fee":"0.00","goods_image":"2019/11/22/2_06277498241227640.jpg","goods_salenum":"0","groupbuy_info":null,"xianshi_info":null,"miaosha_info":[],"spellgroup_info":[],"bargain_info":[],"goods_url":"STORE_SITE_URL/index.php?act=goods&op=index&goods_id=13","group_flag":false,"xianshi_flag":false,"goods_image_url":"http://zhongbyi.aitecc.com/data/upload/shop/store/goods/2/2019/11/22/2_06277498241227640_360.jpg"},{"goods_id":"12","goods_name":"测试助餐套餐","goods_short_title":"经典萝卜拌饭+萝卜酱+清蒸水蛋","goods_price":"0.01","goods_promotion_price":"0.01","goods_shipping_fee":"0.10","goods_image":"2019/10/31/2_06258484919002918.jpg","goods_salenum":"0","groupbuy_info":null,"xianshi_info":null,"miaosha_info":[],"spellgroup_info":[],"bargain_info":[],"goods_url":"STORE_SITE_URL/index.php?act=goods&op=index&goods_id=12","group_flag":false,"xianshi_flag":false,"goods_image_url":"http://zhongbyi.aitecc.com/data/upload/shop/store/goods/2/2019/10/31/2_06258484919002918_360.jpg"}]
     */

    private int status;
    private List<GoodsListBean> goods_list;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<GoodsListBean> getGoods_list() {
        return goods_list;
    }

    public void setGoods_list(List<GoodsListBean> goods_list) {
        this.goods_list = goods_list;
    }

    public static class GoodsListBean {
        /**
         * goods_id : 13
         * goods_name : 助餐商品
         * goods_short_title : 经典萝卜拌饭+萝卜酱+清蒸水蛋11
         * goods_price : 0.01
         * goods_promotion_price : 0.01
         * goods_shipping_fee : 0.00
         * goods_image : 2019/11/22/2_06277498241227640.jpg
         * goods_salenum : 0
         * groupbuy_info : null
         * xianshi_info : null
         * miaosha_info : []
         * spellgroup_info : []
         * bargain_info : []
         * goods_url : STORE_SITE_URL/index.php?act=goods&op=index&goods_id=13
         * group_flag : false
         * xianshi_flag : false
         * goods_image_url : http://zhongbyi.aitecc.com/data/upload/shop/store/goods/2/2019/11/22/2_06277498241227640_360.jpg
         */

        private String goods_id;
        private String goods_name;
        private String goods_short_title;
        private String goods_price;
        private String goods_promotion_price;
        private String goods_shipping_fee;
        private String goods_image;
        private String goods_salenum;
        private Object groupbuy_info;
        private Object xianshi_info;
        private String goods_url;
        private boolean group_flag;
        private boolean xianshi_flag;
        private String goods_image_url;
        private List<?> miaosha_info;
        private List<?> spellgroup_info;
        private List<?> bargain_info;

        public String getGoods_id() {
            return goods_id;
        }

        public void setGoods_id(String goods_id) {
            this.goods_id = goods_id;
        }

        public String getGoods_name() {
            return goods_name;
        }

        public void setGoods_name(String goods_name) {
            this.goods_name = goods_name;
        }

        public String getGoods_short_title() {
            return goods_short_title;
        }

        public void setGoods_short_title(String goods_short_title) {
            this.goods_short_title = goods_short_title;
        }

        public String getGoods_price() {
            return goods_price;
        }

        public void setGoods_price(String goods_price) {
            this.goods_price = goods_price;
        }

        public String getGoods_promotion_price() {
            return goods_promotion_price;
        }

        public void setGoods_promotion_price(String goods_promotion_price) {
            this.goods_promotion_price = goods_promotion_price;
        }

        public String getGoods_shipping_fee() {
            return goods_shipping_fee;
        }

        public void setGoods_shipping_fee(String goods_shipping_fee) {
            this.goods_shipping_fee = goods_shipping_fee;
        }

        public String getGoods_image() {
            return goods_image;
        }

        public void setGoods_image(String goods_image) {
            this.goods_image = goods_image;
        }

        public String getGoods_salenum() {
            return goods_salenum;
        }

        public void setGoods_salenum(String goods_salenum) {
            this.goods_salenum = goods_salenum;
        }

        public Object getGroupbuy_info() {
            return groupbuy_info;
        }

        public void setGroupbuy_info(Object groupbuy_info) {
            this.groupbuy_info = groupbuy_info;
        }

        public Object getXianshi_info() {
            return xianshi_info;
        }

        public void setXianshi_info(Object xianshi_info) {
            this.xianshi_info = xianshi_info;
        }

        public String getGoods_url() {
            return goods_url;
        }

        public void setGoods_url(String goods_url) {
            this.goods_url = goods_url;
        }

        public boolean isGroup_flag() {
            return group_flag;
        }

        public void setGroup_flag(boolean group_flag) {
            this.group_flag = group_flag;
        }

        public boolean isXianshi_flag() {
            return xianshi_flag;
        }

        public void setXianshi_flag(boolean xianshi_flag) {
            this.xianshi_flag = xianshi_flag;
        }

        public String getGoods_image_url() {
            return goods_image_url;
        }

        public void setGoods_image_url(String goods_image_url) {
            this.goods_image_url = goods_image_url;
        }

        public List<?> getMiaosha_info() {
            return miaosha_info;
        }

        public void setMiaosha_info(List<?> miaosha_info) {
            this.miaosha_info = miaosha_info;
        }

        public List<?> getSpellgroup_info() {
            return spellgroup_info;
        }

        public void setSpellgroup_info(List<?> spellgroup_info) {
            this.spellgroup_info = spellgroup_info;
        }

        public List<?> getBargain_info() {
            return bargain_info;
        }

        public void setBargain_info(List<?> bargain_info) {
            this.bargain_info = bargain_info;
        }
    }
}
