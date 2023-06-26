package com.kjh;

public class EMPMainClass {

	public static void main(String[] args) {
		int[] age={27,34,28,26,41,28,42,29,29,32};
		String[] name={"PJH","JDW","AJH","HST","HTW","LWS","LSD","YJH","JSW","LKO"};
		String[] phone={"010-8532-0537","010-9672-5257","010-9932-4536","010-4117-0975","011-8975-7892","010-6251-6976","010-9482-6059","010-4845-0105","010-6283-4849","010-4510-1609"};
		char[] gender={'F','M','F','M','M','F','M','M','F','M'};
		int[] pay={460,200,250,300,300,200,350,200,400,440};
		String[] code={"JP", "FR", "JP", "US", "CN", "DE", "KR", "JP", "DE","KR"};
		/*1. 남자 사원의 평균 나이 구하기
		int cnt = age.length;
		//버그수정 : 여자일경우, 남자로 출력되는 문제발견
		char inputGender = 'F';
		int mAge = 0;
		int mCnt = 0;
		for (int i = 0;i < cnt;i++){
			if(gender[i] == inputGender) {
				mAge += age[i];
				mCnt += 1;
			}
		}
		float mAgeAvg = mAge/mCnt;
		//1차수정방법
		if (inputGender == 'F') {
			System.out.println("여자 사원의 평균 나이 = " + mAgeAvg);
		}else{
			System.out.println("남자 사원의 평균 나이 = " + mAgeAvg);
		}
		//2차수정방법
		String outputGender = "";
		if(inputGender == 'F') {
			outputGender = "여";
		}else{
			outputGender = "남";
		}
		System.out.println(outputGender + "자 사원의 평균 나이 = " + mAgeAvg);
		//3차수정방법 :계속해서 중복코드를 줄여나갈려는 연습을 해야함
		outputGender = "남"; 
		if(inputGender != 'M') {
			outputGender = "여";
		}
		System.out.println(outputGender + "자 사원의 평균 나이 = " + mAgeAvg);
		*/
		
		/*2. 여자사원의 평균 급여 구하기
		char iGender = 'F';
		int sumPay = 0;
		int cnt = 0;
		for (int i = 0;i < gender.length; i++){
			if(gender[i] == iGender) {
				sumPay += pay[i];
				cnt += 1;
			}
		}
		float payAvg = sumPay/cnt;
		char oGender = '남';
		if (iGender != 'M'){
			oGender = '여';
		}
		System.out.println(oGender + "자 사원의 평균 급여 = " + payAvg);
		*/
		//3. 일본에 근무하는 사람들의 이름과 연락처 출력하기
//		String text = "일본에 근무하는 사원들의 이름과 연락처를 출력하기. "	;
//		String iCountry = "CN";
//		for(int i = 0; i < name.length; i++){
//			if(code[i] == iCountry){
//				String[] result = phone[i].split("-");
//				System.out.println(name[i] + ", " + result[0]+"-"+result[1]+"-"+result[2]);
//			}
//		}
		String iCountry = "JP";
		String names = "";
		String num = "";		
		for(int i = 0; i < name.length; i++){
			if(code[i] == iCountry){
				names += name[i] + " ";
				num += phone[i] + " ";
			}
		}
		String[] resName = names.split(" ");
		String[] resNum = num.split(" ");
		for(int i = 0; i<resName.length;i++) {
			System.out.println(resName[i] + ", " + resNum[i]);
		}
	}
}