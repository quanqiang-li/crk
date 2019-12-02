package liqq.crk.model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table crk_product
 */
public class CrkProduct implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * Database Column Remarks:
     *   主键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column crk_product.id
     *
     * @mbg.generated Sat Nov 30 15:44:37 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column crk_product.create_time
     *
     * @mbg.generated Sat Nov 30 15:44:37 CST 2019
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   品牌
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column crk_product.product_brand
     *
     * @mbg.generated Sat Nov 30 15:44:37 CST 2019
     */
    private String productBrand;

    /**
     * Database Column Remarks:
     *   分类
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column crk_product.product_type
     *
     * @mbg.generated Sat Nov 30 15:44:37 CST 2019
     */
    private String productType;

    /**
     * Database Column Remarks:
     *   型号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column crk_product.product_item
     *
     * @mbg.generated Sat Nov 30 15:44:37 CST 2019
     */
    private String productItem;

    /**
     * Database Column Remarks:
     *   适用季节
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column crk_product.suitable_season
     *
     * @mbg.generated Sat Nov 30 15:44:37 CST 2019
     */
    private String suitableSeason;

    /**
     * Database Column Remarks:
     *   适用性别
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column crk_product.suitable_sex
     *
     * @mbg.generated Sat Nov 30 15:44:37 CST 2019
     */
    private String suitableSex;

    /**
     * Database Column Remarks:
     *   尺寸大小
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column crk_product.product_size
     *
     * @mbg.generated Sat Nov 30 15:44:37 CST 2019
     */
    private String productSize;

    /**
     * Database Column Remarks:
     *   颜色
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column crk_product.product_color
     *
     * @mbg.generated Sat Nov 30 15:44:37 CST 2019
     */
    private String productColor;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column crk_product.id
     *
     * @return the value of crk_product.id
     *
     * @mbg.generated Sat Nov 30 15:44:37 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column crk_product.id
     *
     * @param id the value for crk_product.id
     *
     * @mbg.generated Sat Nov 30 15:44:37 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column crk_product.create_time
     *
     * @return the value of crk_product.create_time
     *
     * @mbg.generated Sat Nov 30 15:44:37 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column crk_product.create_time
     *
     * @param createTime the value for crk_product.create_time
     *
     * @mbg.generated Sat Nov 30 15:44:37 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column crk_product.product_brand
     *
     * @return the value of crk_product.product_brand
     *
     * @mbg.generated Sat Nov 30 15:44:37 CST 2019
     */
    public String getProductBrand() {
        return productBrand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column crk_product.product_brand
     *
     * @param productBrand the value for crk_product.product_brand
     *
     * @mbg.generated Sat Nov 30 15:44:37 CST 2019
     */
    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand == null ? null : productBrand.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column crk_product.product_type
     *
     * @return the value of crk_product.product_type
     *
     * @mbg.generated Sat Nov 30 15:44:37 CST 2019
     */
    public String getProductType() {
        return productType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column crk_product.product_type
     *
     * @param productType the value for crk_product.product_type
     *
     * @mbg.generated Sat Nov 30 15:44:37 CST 2019
     */
    public void setProductType(String productType) {
        this.productType = productType == null ? null : productType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column crk_product.product_item
     *
     * @return the value of crk_product.product_item
     *
     * @mbg.generated Sat Nov 30 15:44:37 CST 2019
     */
    public String getProductItem() {
        return productItem;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column crk_product.product_item
     *
     * @param productItem the value for crk_product.product_item
     *
     * @mbg.generated Sat Nov 30 15:44:37 CST 2019
     */
    public void setProductItem(String productItem) {
        this.productItem = productItem == null ? null : productItem.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column crk_product.suitable_season
     *
     * @return the value of crk_product.suitable_season
     *
     * @mbg.generated Sat Nov 30 15:44:37 CST 2019
     */
    public String getSuitableSeason() {
        return suitableSeason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column crk_product.suitable_season
     *
     * @param suitableSeason the value for crk_product.suitable_season
     *
     * @mbg.generated Sat Nov 30 15:44:37 CST 2019
     */
    public void setSuitableSeason(String suitableSeason) {
        this.suitableSeason = suitableSeason == null ? null : suitableSeason.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column crk_product.suitable_sex
     *
     * @return the value of crk_product.suitable_sex
     *
     * @mbg.generated Sat Nov 30 15:44:37 CST 2019
     */
    public String getSuitableSex() {
        return suitableSex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column crk_product.suitable_sex
     *
     * @param suitableSex the value for crk_product.suitable_sex
     *
     * @mbg.generated Sat Nov 30 15:44:37 CST 2019
     */
    public void setSuitableSex(String suitableSex) {
        this.suitableSex = suitableSex == null ? null : suitableSex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column crk_product.product_size
     *
     * @return the value of crk_product.product_size
     *
     * @mbg.generated Sat Nov 30 15:44:37 CST 2019
     */
    public String getProductSize() {
        return productSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column crk_product.product_size
     *
     * @param productSize the value for crk_product.product_size
     *
     * @mbg.generated Sat Nov 30 15:44:37 CST 2019
     */
    public void setProductSize(String productSize) {
        this.productSize = productSize == null ? null : productSize.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column crk_product.product_color
     *
     * @return the value of crk_product.product_color
     *
     * @mbg.generated Sat Nov 30 15:44:37 CST 2019
     */
    public String getProductColor() {
        return productColor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column crk_product.product_color
     *
     * @param productColor the value for crk_product.product_color
     *
     * @mbg.generated Sat Nov 30 15:44:37 CST 2019
     */
    public void setProductColor(String productColor) {
        this.productColor = productColor == null ? null : productColor.trim();
    }
}