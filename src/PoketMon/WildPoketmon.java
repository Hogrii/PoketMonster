package PoketMon;

import java.util.HashMap;

public class WildPoketmon {
	private HashMap<Integer, String> wildPoketmon = new HashMap<>();
	
	public WildPoketmon() {
		init();
	}
	
	// 야생 포켓몬 출력
	public int appearPoketmon() {		
		return randomDex();
	}
	
	// 야생 포켓몬 도감번호 랜덤으로 가져오기
	public int randomDex() {
		return (int)(Math.random()*151 + 1);
	}
	
	// 초기화
	private void init() {
		wildPoketmon.put(1, "이상해씨");
		wildPoketmon.put(2, "이상해풀");
		wildPoketmon.put(3, "이상해꽃");
		wildPoketmon.put(4, "파이리");
		wildPoketmon.put(5, "리자드");
		wildPoketmon.put(6, "리자몽");
		wildPoketmon.put(7, "꼬부기");
		wildPoketmon.put(8, "어니부기");
		wildPoketmon.put(9, "거북왕");
		wildPoketmon.put(10, "캐터피");
		wildPoketmon.put(11, "단데기");
		wildPoketmon.put(12, "버터플");
		wildPoketmon.put(13, "뿔충이");
		wildPoketmon.put(14, "딱충이");
		wildPoketmon.put(15, "독침붕");
		wildPoketmon.put(16, "구구");
		wildPoketmon.put(17, "피죤");
		wildPoketmon.put(18, "피죤투");
		wildPoketmon.put(19, "꼬렛");
		wildPoketmon.put(20, "레트라");
		wildPoketmon.put(21, "깨비참");
		wildPoketmon.put(22, "깨비드릴조");
		wildPoketmon.put(23, "아보");
		wildPoketmon.put(24, "아보크");
		wildPoketmon.put(25, "피카츄");
		wildPoketmon.put(26, "라이츄");
		wildPoketmon.put(27, "모래두지");
		wildPoketmon.put(28, "고지");
		wildPoketmon.put(29, "니드런♀");
		wildPoketmon.put(30, "니드리나");
		wildPoketmon.put(31, "니드퀸");
		wildPoketmon.put(32, "니드런♂");
		wildPoketmon.put(33, "니드리노");
		wildPoketmon.put(34, "니드킹");
		wildPoketmon.put(35, "삐삐");
		wildPoketmon.put(36, "픽시");
		wildPoketmon.put(37, "식스테일");
		wildPoketmon.put(38, "나인테일");
		wildPoketmon.put(39, "푸린");
		wildPoketmon.put(40, "푸크린");
		wildPoketmon.put(41, "주뱃");
		wildPoketmon.put(42, "골뱃");
		wildPoketmon.put(43, "뚜벅쵸");
		wildPoketmon.put(44, "냄새꼬");
		wildPoketmon.put(45, "라플레시아");
		wildPoketmon.put(46, "파라스");
		wildPoketmon.put(47, "파라섹트");
		wildPoketmon.put(48, "콘팡");
		wildPoketmon.put(49, "도나리");
		wildPoketmon.put(50, "디그다");
		wildPoketmon.put(51, "닥트리오");
		wildPoketmon.put(52, "나옹");
		wildPoketmon.put(53, "페르시온");
		wildPoketmon.put(54, "고라파덕");
		wildPoketmon.put(55, "골덕");
		wildPoketmon.put(56, "망키");
		wildPoketmon.put(57, "성원숭");
		wildPoketmon.put(58, "가디");
		wildPoketmon.put(59, "윈디");
		wildPoketmon.put(60, "발챙이");
		wildPoketmon.put(61, "수륙챙이");
		wildPoketmon.put(62, "강챙이");
		wildPoketmon.put(63, "케이시");
		wildPoketmon.put(64, "윤겔라");
		wildPoketmon.put(65, "후딘");
		wildPoketmon.put(66, "알통몬");
		wildPoketmon.put(67, "근육몬");
		wildPoketmon.put(68, "괴력몬");
		wildPoketmon.put(69, "모다피");
		wildPoketmon.put(70, "우츠동");
		wildPoketmon.put(71, "우츠보트");
		wildPoketmon.put(72, "왕눈해");
		wildPoketmon.put(73, "독파리");
		wildPoketmon.put(74, "꼬마돌");
		wildPoketmon.put(75, "데구리");
		wildPoketmon.put(76, "딱구리");
		wildPoketmon.put(77, "포니타");
		wildPoketmon.put(78, "날쌩마");
		wildPoketmon.put(79, "야돈");
		wildPoketmon.put(80, "야도란");
		wildPoketmon.put(81, "코일");
		wildPoketmon.put(82, "레어코일");
		wildPoketmon.put(83, "파오리");
		wildPoketmon.put(84, "두두");
		wildPoketmon.put(85, "두트리오");
		wildPoketmon.put(86, "쥬쥬");
		wildPoketmon.put(87, "쥬레곤");
		wildPoketmon.put(88, "질퍽이");
		wildPoketmon.put(89, "질뻐기");
		wildPoketmon.put(90, "샐러");
		wildPoketmon.put(91, "파르셀");
		wildPoketmon.put(92, "고오스");
		wildPoketmon.put(93, "고우스트");
		wildPoketmon.put(94, "팬텀");
		wildPoketmon.put(95, "롱스톤");
		wildPoketmon.put(96, "슬리프");
		wildPoketmon.put(97, "슬리퍼");
		wildPoketmon.put(98, "크랩");
		wildPoketmon.put(99, "킹크랩");
		wildPoketmon.put(100, "찌리리공");
		wildPoketmon.put(101, "붐볼");
		wildPoketmon.put(102, "아라리");
		wildPoketmon.put(103, "나시");
		wildPoketmon.put(104, "탕구리");
		wildPoketmon.put(105, "텅구리");
		wildPoketmon.put(106, "시라소몬");
		wildPoketmon.put(107, "홍수몬");
		wildPoketmon.put(108, "내루미");
		wildPoketmon.put(109, "또가스");
		wildPoketmon.put(110, "또도가스");
		wildPoketmon.put(111, "뿔카노");
		wildPoketmon.put(112, "코뿌리");
		wildPoketmon.put(113, "럭키");
		wildPoketmon.put(114, "덩쿠리");
		wildPoketmon.put(115, "캥카");
		wildPoketmon.put(116, "쏘드라");
		wildPoketmon.put(117, "시드라");
		wildPoketmon.put(118, "콘치");
		wildPoketmon.put(119, "왕콘치");
		wildPoketmon.put(120, "별가사리");
		wildPoketmon.put(121, "아쿠스타");
		wildPoketmon.put(122, "마임맨");
		wildPoketmon.put(123, "스라크");
		wildPoketmon.put(124, "루주라");
		wildPoketmon.put(125, "에레브");
		wildPoketmon.put(126, "마그마");
		wildPoketmon.put(127, "쁘사이저");
		wildPoketmon.put(128, "켄타로스");
		wildPoketmon.put(129, "잉어킹");
		wildPoketmon.put(130, "갸라도스");
		wildPoketmon.put(131, "라프라스");
		wildPoketmon.put(132, "메타몽");
		wildPoketmon.put(133, "이브이");
		wildPoketmon.put(134, "샤미드");
		wildPoketmon.put(135, "쥬피썬더");
		wildPoketmon.put(136, "부스터");
		wildPoketmon.put(137, "폴리곤");
		wildPoketmon.put(138, "암나이트");
		wildPoketmon.put(139, "암스타");
		wildPoketmon.put(140, "투구");
		wildPoketmon.put(141, "투구푸스");
		wildPoketmon.put(142, "프테라");
		wildPoketmon.put(143, "잠만보");
		wildPoketmon.put(144, "프리져");
		wildPoketmon.put(145, "썬더");
		wildPoketmon.put(146, "파이어");
		wildPoketmon.put(147, "미뇽");
		wildPoketmon.put(148, "신뇽");
		wildPoketmon.put(149, "망나뇽");
		wildPoketmon.put(150, "뮤츠");
		wildPoketmon.put(151, "뮤");
	}
	
	public HashMap<Integer, String> getWildPoketmon() {
		return this.wildPoketmon;
	}
}
