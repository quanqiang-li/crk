package liqq.crk.model;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table crk_input
 */
public class CrkInput {
    /**
     * Database Column Remarks:
     *   主键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column crk_input.id
     *
     * @mbg.generated Tue Dec 03 09:02:39 CST 2019
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   商品 id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column crk_input.product_id
     *
     * @mbg.generated Tue Dec 03 09:02:39 CST 2019
     */
    private Integer productId;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column crk_input.create_time
     *
     * @mbg.generated Tue Dec 03 09:02:39 CST 2019
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   入库时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column crk_input.input_date
     *
     * @mbg.generated Tue Dec 03 09:02:39 CST 2019
     */
    @JsonFormat(pattern="yyyy-MM-dd",locale="zh",timezone="GMT+8")
    private Date inputDate;

    /**
     * Database Column Remarks:
     *   数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column crk_input.input_num
     *
     * @mbg.generated Tue Dec 03 09:02:39 CST 2019
     */
    private Integer inputNum;

    /**
     * Database Column Remarks:
     *   单价
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column crk_input.input_price
     *
     * @mbg.generated Tue Dec 03 09:02:39 CST 2019
     */
    private BigDecimal inputPrice;

    /**
     * Database Column Remarks:
     *   总价
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column crk_input.input_total
     *
     * @mbg.generated Tue Dec 03 09:02:39 CST 2019
     */
    private BigDecimal inputTotal;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column crk_input.id
     *
     * @return the value of crk_input.id
     *
     * @mbg.generated Tue Dec 03 09:02:39 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column crk_input.id
     *
     * @param id the value for crk_input.id
     *
     * @mbg.generated Tue Dec 03 09:02:39 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column crk_input.product_id
     *
     * @return the value of crk_input.product_id
     *
     * @mbg.generated Tue Dec 03 09:02:39 CST 2019
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column crk_input.product_id
     *
     * @param productId the value for crk_input.product_id
     *
     * @mbg.generated Tue Dec 03 09:02:39 CST 2019
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column crk_input.create_time
     *
     * @return the value of crk_input.create_time
     *
     * @mbg.generated Tue Dec 03 09:02:39 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column crk_input.create_time
     *
     * @param createTime the value for crk_input.create_time
     *
     * @mbg.generated Tue Dec 03 09:02:39 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column crk_input.input_date
     *
     * @return the value of crk_input.input_date
     *
     * @mbg.generated Tue Dec 03 09:02:39 CST 2019
     */
    public Date getInputDate() {
        return inputDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column crk_input.input_date
     *
     * @param inputDate the value for crk_input.input_date
     *
     * @mbg.generated Tue Dec 03 09:02:39 CST 2019
     */
    public void setInputDate(Date inputDate) {
        this.inputDate = inputDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column crk_input.input_num
     *
     * @return the value of crk_input.input_num
     *
     * @mbg.generated Tue Dec 03 09:02:39 CST 2019
     */
    public Integer getInputNum() {
        return inputNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column crk_input.input_num
     *
     * @param inputNum the value for crk_input.input_num
     *
     * @mbg.generated Tue Dec 03 09:02:39 CST 2019
     */
    public void setInputNum(Integer inputNum) {
        this.inputNum = inputNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column crk_input.input_price
     *
     * @return the value of crk_input.input_price
     *
     * @mbg.generated Tue Dec 03 09:02:39 CST 2019
     */
    public BigDecimal getInputPrice() {
        return inputPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column crk_input.input_price
     *
     * @param inputPrice the value for crk_input.input_price
     *
     * @mbg.generated Tue Dec 03 09:02:39 CST 2019
     */
    public void setInputPrice(BigDecimal inputPrice) {
        this.inputPrice = inputPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column crk_input.input_total
     *
     * @return the value of crk_input.input_total
     *
     * @mbg.generated Tue Dec 03 09:02:39 CST 2019
     */
    public BigDecimal getInputTotal() {
        return inputTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column crk_input.input_total
     *
     * @param inputTotal the value for crk_input.input_total
     *
     * @mbg.generated Tue Dec 03 09:02:39 CST 2019
     */
    public void setInputTotal(BigDecimal inputTotal) {
        this.inputTotal = inputTotal;
    }
}