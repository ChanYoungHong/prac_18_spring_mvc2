package com.spring.mvc22.dataTransfer.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.mvc22.dataTransfer.domain.OrderDto;

@Repository
public class OrderDao {

	@Autowired
	private SqlSession sqlSession;
	
	
	// 1) Mapper -> Dao 전송
	public void selectAll() {
		
		System.out.println("\n selectAll \n");
		
		List<OrderDto> orderList = sqlSession.selectList("order.selectAll");
		
		for(OrderDto orderDto : orderList) {
			System.out.println(orderDto);
		}
	}
	
	// 2) Mapper -> Dao 전송
	public void select1( ) {
		
		System.out.println("\n select1 \n");
		
		int count = sqlSession.selectOne("order.select1");
		System.out.println("count : " + count);
	}
	
	// 3) Mapper -> Dao 전송
	public void select2() {
		
		System.out.println("\n select2 \n ");
		
		List<OrderDto> orderList = sqlSession.selectList("order.select2");
		
		for(OrderDto orderDto : orderList) {
			System.out.println(orderDto);
		}
	}
	
	// 4) Mapper -> Dao 전
	public void select3() {
		
		System.out.println("\n select3 \n");
		
		List<Map<String, Object>> orderList = sqlSession.selectList("order.select3");
		
		for (Map<String, Object> map : orderList) {
			System.out.println(map);
			System.out.println("memberId : "     + map.get("memberId"));
			System.out.println("orderId : "      + map.get("orderId"));
			System.out.println("productName : "  + map.get("productName"));
			System.out.println("productPrice : " + map.get("productPrice"));
			System.out.println("tax : " 		 + map.get("tax"));
			System.out.println("afterTax : "     + map.get("afterTax"));
			System.out.println("orderCount : "   + map.get("orderCount"));
			System.out.println("totalPrice : "   + map.get("totalPrice"));
			System.out.println("imageName : "    + map.get("imageName"));
			System.out.println("imageType : "    + map.get("imageType"));
			System.out.println("fileSize : "     + map.get("fileSize"));
			System.out.println();
		}
	}
	
	// 4) Mapper -> Dao 전송
	public void select4() {
		
		System.out.println("\n select4 \n");
		
		List<Map<String, Object>> orderList = sqlSession.selectList("order.select4");
		
		for (Map<String, Object> map : orderList) {
			System.out.println(map);
			System.out.println("memberId : "     + map.get("memberId"));
			System.out.println("orderId : "      + map.get("orderId"));
			System.out.println("productName : "  + map.get("productName"));
			System.out.println("productPrice : " + map.get("productPrice"));
			System.out.println("tax : " 		 + map.get("tax"));
			System.out.println("afterTax : "     + map.get("afterTax"));
			System.out.println("orderCount : "   + map.get("orderCount"));
			System.out.println("totalPrice : "   + map.get("totalPrice"));
			System.out.println("imageName : "    + map.get("imageName"));
			System.out.println("imageType : "    + map.get("imageType"));
			System.out.println("fileSize : "     + map.get("fileSize"));
			System.out.println();
		}
	}
	
	// Dao -> Mappers
	
	// 1) 단일 전송일 때 
	public void insertData1(String memberId) {
		sqlSession.insert("order.insertSingleData", memberId);
	}
	
	// 2) Dto전송 일 때
	public void insertData2(OrderDto orderDto) {
		sqlSession.insert("order.inserDto", orderDto);
	}
	
	// 3) Map 전송 일 때
	public void insertData3(Map<String, String> orderMap) {
		sqlSession.insert("order.inserMap", orderMap);
	}

}
