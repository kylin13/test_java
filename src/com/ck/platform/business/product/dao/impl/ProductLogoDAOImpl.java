package com.ck.platform.business.product.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.ck.platform.base.util.core.jdbc.dao.GenericDAOIbatisImpl;
import com.ck.platform.base.util.core.page.Page;
import com.ck.platform.business.product.dao.ProductLogoDAO;


@SuppressWarnings({ "rawtypes" })
@Repository("productLogoDAO")
public class ProductLogoDAOImpl extends GenericDAOIbatisImpl<HashMap> implements ProductLogoDAO
	{
		private static final Logger logger = Logger.getLogger(ProductLogoDAOImpl.class);

		private static String IBATIS_NS_PREFIX = "product_logo.";

		@Override
		public Long create(Map paramMap)
		{
			return create(IBATIS_NS_PREFIX, paramMap);
		}

		@Override
		public void update(Map paramMap)
		{
			update(IBATIS_NS_PREFIX, paramMap);
		}

		@Override
		public HashMap getById(String id)
		{
			return (HashMap) getById(IBATIS_NS_PREFIX, id);
		}
		
		@Override
		public Page getPageList(Map paramMap)
		{
			return getPageList(IBATIS_NS_PREFIX, paramMap);
		}

		@Override
		public List<HashMap> getList(Map paramMap)
		{
			return (List<HashMap>) getList(IBATIS_NS_PREFIX, paramMap);
		}

		@Override
		public int getCount(Map paramMap)
		{
			return (Integer) getCount(IBATIS_NS_PREFIX, paramMap);
		}

		
		@Override
		public HashMap getByParam(Map paramMap)
		{
			return (HashMap) getByParam(IBATIS_NS_PREFIX, paramMap);
		}
		
		
		
}

  
