#구현 방법

1. 이미지뷰와 텍스트뷰들을
app : layout_constraint000_to000of = "~"
을 이용하여, 자리를 배치해주었다.

이때 이미지는 constraintDimentionRatio를 이용하여 1:1 비율로 만들어서 넣어주었다.


2. 가이드라인을 만들어서 원하는 텍스트뷰의 한 부분을 가이드라인에 구속시켜주었다.

-가이드라인 : androidx.constraintlayout.widget.Guideline
-가이드라인의 orientation의 값으로 가로나 세로 선을 그릴 수 있다.

3. 가이드라인을 기준으로 텍스트뷰들이 정렬되고 글이 길어지는 텍스트뷰는 height가 wrap_content이기 때문에 저절로 개행이 되었다.


#과제하면서 얻게 된 부분

-이미지뷰에 들어가는 사진 크기 조정을 할 수 있는 것 : android:scaleType="fitCenter"

-이미지뷰에 외부에서 가지고 오는 사진을 넣으면 android:contentDescription="chicken image"을 함께 넣어주어 소실되었을때
사진이 대체되는 글자가 채워져 있게 해야 한다. 안그러면 오류가 난다.

-이미지뷰의비율을 조정하기 위해 사용되는 app:layout_constraintDimensionRatio는
이미지뷰의 너비나 높이 둘 중 하나가 match_constraint여야만 사용 가능하다.

-한글로 작성한 부분에 string 오류가 뜨는데, 이 부분은 굳이 신경쓰지 않아도 된다.

-match_content와 match_constraint와의 차이
: match_constraint는 ConstraintLayout만의 특별한 기능이다.

-chain의 기능이 굳이 필요하지 않다면 서로 간 구속을 굳이 하지 않아도 된다.
그러나, 가독성을 위해서는 View의 상하좌우에 구속 조건을 걸어주는 것이 좋다.