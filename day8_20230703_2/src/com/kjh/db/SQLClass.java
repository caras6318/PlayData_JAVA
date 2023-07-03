package com.kjh.db;
//SQL 쿼리 처리담당클래스 
// CRUD담당 각 메서드 작성해서 담당할예정
// 조회 메서드 (목록 버튼 눌렀을때) 
//	select FieldList from TableName limit StartNum, CntNum
//	order by NumField desc(기본값은 asc)

// 삭제 메서드 (삭제 버튼 눌렀을떄)
//delete form TableName where NumField(삭제할 번호) 
//delete => 한 Field 가 사라지는게 아니라 Record가 사라지는 것

// 수정 메서드 (글 수정후, 등록버튼을 눌렀을때)
//update TableName set 수정필드 = 수정값, 수정필드 = 수정값...
//where NumField = ReplaceNum

// 삽입 메서드 (글 작성후, 등록버튼을 눌렀을때)
//insert into TableName (Field List)가 필수
//values ( 각 필드 리스트에 해당하는 값들)


public class SQLClass {

	public SQLClass() {
		// TODO Auto-generated constructor stub
	}

}
