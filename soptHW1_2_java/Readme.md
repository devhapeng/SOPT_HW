**실수
레이아웃 구성 실습을 따라하다보니 수업을 제대로 듣지 못하고
자바로도 과제가 가능하다고 생각해서 자바로 과제를 수행해버림.

#구현 방법

(xml 관련된 사항은 앞선 과제에서 적용되어 생략)


1. 버튼을 눌렀을 때 원하는 다른 액티비티로 넘어가게 만든다.

-버튼을 눌렀을 때 발생하는 클릭 이벤트를 사용한다.
-클릭 이벤트가 발생하였을 때, 인텐트를 사용하여 지정한 파일로 연결되도록 만든다.
 Intent intent = new Intent(getApplicationContext(), SubActivity.class);
                startActivity(intent);

2. 버튼을 눌러 2번째 화면으로 넘어간 이후
2번째 화면에 editText 뷰에 입력된 값을 1번째 화면의 뷰에 각각 전달하도록 만든다.

-이때, 이용하는 것이 putStringExtra, getStringExtra 이다.

3. 전달할 값을 putExtra를 이용하여 전달한다.
        intent.putExtra("email", email);
        intent.putExtra("password", password);

4. 전달된 값을 getExtra를 이용하여 받는다.
        String email = intent2.getStringExtra("email");
        String password = intent2.getStringExtra("password");


#과제하면서 얻게 된 부분

-getText().toString()으로 문자열 값을 얻어서 전달할 준비를 할 수 있다.
예)String email = edit1.getText().toString();
 String password = edit2.getText().toString();

