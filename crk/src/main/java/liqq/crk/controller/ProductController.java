package liqq.crk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;

import liqq.crk.common.Code;
import liqq.crk.common.ReturnData;
import liqq.crk.model.CrkInput;
import liqq.crk.model.CrkOutput;
import liqq.crk.model.CrkProduct;
import liqq.crk.service.ProductService;

@RestController
@RequestMapping("product")
public class ProductController {

	@Autowired
	private ProductService productService;

	/**
	 * 分页查询商品
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@GetMapping("pageList")
	public ReturnData pageList(Integer pageNum, Integer pageSize,String productItem) {
		pageNum = pageNum == null ? 1 : pageNum;
		pageSize = pageSize == null ? 10 : pageSize;
		PageInfo<CrkProduct> page = productService.selectPage(pageNum, pageSize,productItem);
		return new ReturnData(Code.OK, page);
	}

	/**
	 * 添加商品
	 * 
	 * @param crkProduct
	 * @return
	 */
	@PostMapping("addProduct")
	public ReturnData addProduct(CrkProduct crkProduct) {
		productService.addProduct(crkProduct);
		return new ReturnData(Code.OK, null);
	}
	
	/**
	 * 入库
	 * @param crkInput
	 * @return
	 */
	@PostMapping("crkInput")
	public ReturnData crkInput(@RequestBody CrkInput crkInput) {
		productService.crkInput(crkInput);
		return new ReturnData(Code.OK, null);
	}
	
	/**
	 * 入库分页查询
	 * @param pageNum
	 * @param pageSize
	 * @param productItem
	 * @return
	 */
	@GetMapping("pageListCrkInput")
	public ReturnData pageListCrkInput(Integer pageNum, Integer pageSize,String productItem) {
		pageNum = pageNum == null ? 1 : pageNum;
		pageSize = pageSize == null ? 10 : pageSize;
		PageInfo<CrkProduct> page = productService.selectPageCrkInput(pageNum, pageSize,productItem);
		return new ReturnData(Code.OK, page);
	}
	
	/**
	 * 入库
	 * @param crkInput
	 * @return
	 */
	@PostMapping("crkOutput")
	public ReturnData crkOutput(@RequestBody CrkOutput crkOutput) {
		productService.crkOutput(crkOutput);
		return new ReturnData(Code.OK, null);
	}
	
	/**
	 * 入库分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@GetMapping("pageListCrkOutput")
	public ReturnData pageListCrkOutput(Integer pageNum, Integer pageSize,String productItem) {
		pageNum = pageNum == null ? 1 : pageNum;
		pageSize = pageSize == null ? 10 : pageSize;
		PageInfo<CrkProduct> page = productService.selectPageCrkOutput(pageNum, pageSize,productItem);
		return new ReturnData(Code.OK, page);
	}

}
