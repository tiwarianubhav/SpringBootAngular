package com.dtcc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.dtcc.model.Products;

public class ProductStub {

	
		private static Map<Long, Products> prod = new HashMap<Long, Products>();
		private static Long idIndex = 3L;

		//populate initial wrecks
		static {
			Products a = new Products(1L, "Leaf Rake", "GDN-0011", "March 19, 2016", "Leaf rake with 48-inch wooden handle", 19L, 3L, "http://openclipart.org/image/300px/svg_to_png/26215/Anonymous_Leaf_Rake.png");
			prod.put(1L, a);
			
		}

		public static List<Products> list() {
			return new ArrayList<Products>(prod.values());
		}

}
