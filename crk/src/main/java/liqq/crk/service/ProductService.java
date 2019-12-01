package liqq.crk.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import liqq.crk.dao.mysql.CrkProductMapper;
import liqq.crk.model.CrkProduct;
import liqq.crk.model.CrkProductExample;

@Service
public class ProductService {

	@Autowired
	private CrkProductMapper crkProductMapper;
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<CrkProduct> selectPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<CrkProduct> list = crkProductMapper.selectByExample(new CrkProductExample());
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
}
