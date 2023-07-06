package com.roy.db;

public interface Querys {
	static final String querySelectAll ="select * from bootcamp2"; //
	static final String querySelectOneQ4 ="select * from bootcamp2 where cVisitNo>VisitAvg";
	static final String querySelectOneQ5 ="select * from bootcamp2 where cAge = '비공개'";
	static final String queryInsert ="insert into bootcamp2 (String cName, String cRating, String cJoinDate, String cLastDate, Int cVisitNo, Int cPostNo, Int cCommentNo ,String cGenger, String cAge) values (?,?,?,?,?,0,0,?,?)";
	static final String queryUpdate = "update bootcamp2 set cGenger = ?   where cGenger = “기타” AND cName = ?";
}

// 평균 방문횟수 보다 많이 방문화 사람 명단 출력
// querySelectOne = "select * from bootcamp2 where cVisitNo>VisitAvg";
// VisitAvg = SumcVisitNo / Count

// "select * from bootcamp2 where cAge = "비공개";


/**
create table employee (
	this.cName = cName;
	this.cRating = cRating;
	this.cJoinDate = cJoinDate;
	this.cLastDate = cLastDate;
	this.cVisitNo = cVisitNo;
	this.cPostNo = cPostNo;
	this.cCommentNo = cCommentNo;
	this.cGenger = cGenger;
	this.cAge = cAge;
);
**/