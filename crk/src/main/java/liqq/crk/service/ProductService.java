package liqq.crk.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import liqq.crk.dao.mysql.CrkInputMapper;
import liqq.crk.dao.mysql.CrkOutputMapper;
import liqq.crk.dao.mysql.CrkProductMapper;
import liqq.crk.model.CrkInput;
import liqq.crk.model.CrkOutput;
import liqq.crk.model.CrkOutputExample;
import liqq.crk.model.CrkProduct;

@Service
public class ProductService {

	@Autowired
	private CrkProductMapper crkProductMapper;
	@Autowired
	private CrkInputMapper crkInputMapper;
	@Autowired
	private CrkOutputMapper crkOutputMapper;
	/**
	 * 分页查询商品
	 * @param pageNum
	 * @param pageSize
	 * @param productItem
	 * @return
	 */
	public PageInfo<CrkProduct> selectPage(int pageNum, int pageSize,String productItem) {
		PageHelper.startPage(pageNum, pageSize);
		List<CrkProduct> list = crkProductMapper.selectByItem(productItem);
		// 用PageInfo对结果进行包装
		PageInfo<CrkProduct> page = new PageInfo<>(list);
		return page;
	}
	
	/**
	 * 添加商品
	 * @param crkProduct
	 * @return
	 */
	public int addProduct(CrkProduct crkProduct) {
		crkProduct.setCreateTime(new Date());
		return crkProductMapper.insert(crkProduct);
	}
	
	/**
	 * 商品入库
	 * @param crkProduct
	 * @return
	 */
	public int crkInput(CrkInput crkInput) {
		crkInput.setCreateTime(new Date());
		//总价计算
		crkInput.setInputTotal(crkInput.getInputPrice().multiply(BigDecimal.valueOf(crkInput.getInputNum())));
		return crkInputMapper.insert(crkInput);
	}
	
	/**
	 * 分页查询入库明细
	 * @param pageNum
	 * @param pageSize
	 * @param productItem
	 * @return
	 */
	public PageInfo<CrkProduct> selectPageCrkInput(int pageNum, int pageSize,String productItem) {
		PageHelper.startPage(pageNum, pageSize);
		List<CrkProduct> list = crkProductMapper.selectByInput(productItem);
		// 用PageInfo对结果进行包装
		PageInfo<CrkProduct> page = new PageInfo<>(list);
		return page;
	}
	
	/**
	 * 商品出库
	 * @param crkProduct
	 * @return
	 */
	public int crkOutput(CrkOutput crkOutput) {
		crkOutput.setCreateTime(new Date());
		//总价计算
		crkOutput.setOutputTotal(crkOutput.getOutputPrice().multiply(BigDecimal.valueOf(crkOutput.getOutputNum())));
		return crkOutputMapper.insert(crkOutput);
	}
	
	/**
	 * 分页查询出库明细
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<CrkOutput> selectPageCrkOutput(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		CrkOutputExample crkOutputExample = new CrkOutputExample();
		List<CrkOutput> list = crkOutputMapper.selectByExample(crkOutputExample);
		// 用PageInfo对结果进行包装
		PageInfo<CrkOutput> page = new PageInfo<>(list);
		return page;
	}
}
