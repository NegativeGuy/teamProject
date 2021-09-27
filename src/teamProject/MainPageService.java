package teamProject;


import java.util.ArrayList;

import bookService.BookDTO;
import dbService.BestSellerDBService;
import javafx.collections.FXCollections;
import javafx.scene.Parent;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class MainPageService {
	
	Parent root;
	ImageView fxImageView;
	Image image;
	TextArea fxBookInfo;
	Label fxBookTitle;
	Label fxBookAuthor;
	int bookNum=0;
	int vote=0;
	BookDTO bs;
	BestSellerDBService bsDB;
	private BarChart barChart;
	
	public MainPageService() {		
		
	}
	public void setRoot(Parent root) {
		this.root = root;
		barChart = (BarChart)root.lookup("#barChart");
	}
	
	public void arrowClick(int arrClk) {
		System.out.println(bookNum); //1 5
		//bookInfo(bookNum);
		fxImageView = (ImageView)root.lookup("#viewBook");
		if(arrClk==0) {
			bookNum--;
			System.out.println(bookNum);  //0 4
			if(bookNum<1) {
				bookNum=5;
			}
			image = new Image(getClass().getResource("/teamProject/books/book"+bookNum+".png").toExternalForm());
			fxImageView.setImage(image);
			//System.out.println("왼쪽 클릭");
		}else {
			bookNum++;
			if(bookNum>5) {
				bookNum=1;
			}
			image = new Image(getClass().getResource("/teamProject/books/book"+bookNum+".png").toExternalForm());
			fxImageView.setImage(image);
			//System.out.println("오른쪽 클릭");
		}
		bookInfo(bookNum);
		System.out.println(bookNum); //5 4
	}
	
	public void bookInfo(int bookNum) {
		System.out.println(bookNum);
		String test;
		fxBookInfo = (TextArea)root.lookup("#bookInfo");
		fxBookTitle = (Label)root.lookup("#booktitle");
		fxBookAuthor = (Label)root.lookup("#author");
		
		switch(bookNum) {
		case 1:
			System.out.println("case1");
			
			fxBookTitle.setText("오케팅");
			fxBookAuthor.setText("오두한");
			
			test = ("출판사 서평\n\n〈오케팅〉\n\n"
					+ "특별하지 않아도 누구나 부자가 될 수 있다!\r\n"
					+ "세상에 없던 기발한 전략을 드디어 공개한다.\r\n"
					+ "리스크 없이 상위 5% 부자가 되는 전략,\r\n"
					+ "지금 바로 오케팅을 시작하라!\r\n"
					+ "특별한 사람들만 부자가 되는 걸까? 그렇지 않다. 이 책의 저자도 특별하지 않다.\r\n"
					+ "지방대 낙제생, 무 스펙 백수, 초짜 신입, 반지하 세입자, 실직자.\r\n"
					+ "이런 그가 어떻게 상위 1% 부자가 되었을까?\r\n"
					+ "이제는 부자 되는 방법의 패러다임을 바꿀 때다. ‘오케팅(Oketing)’으로 사고의 틀을 180° 전환하면 누구나 경제적 자유를 얻을 수 있다. 오케팅은 개인과 기업, 제품, 서비스 등 어디에나 적용할 수 있는 생계형 마케팅 전략이다. 저자는 흔히 말하는 주식과 사업으로 성공하지 않았다. 말단 사원일 때부터 리스크 전혀 없이 오로지 오케팅만으로 상위 1% 부자가 되었다. 이 책에는 평범한 사람도 상위 5% 부자가 되는 방법이 담겨 있다.\r\n"
					+ "저자가 상위 1% 부자가 되기까지의 여정을 함께하다 보면 어느새 성공으로 향하는 길이 보인다. 특히 오케팅하는 방법을 보물선 항해에 빗대어 풀어내 누구나 쉽게 익히고 실천할 수 있도록 했다. 이 책은 오케팅을 실생활뿐만 아니라 모든 곳에 적용해 성공할 수 있는 사고력을 길러 준다. 직업이나 성별, 나이에 무관하게 누구나 읽고 배우는 데 막힘이 없어 삶의 질을 높이고 싶은 모든 이에게 희망을 선사한다.\r\n"
					+ "특별하지 않은 사람도 특별해지는 전략,\r\n"
					+ "오케팅을 익히고 실천한다면 95%와 다른 5%의 삶을 살게 될 것이다.");
			fxBookInfo.setText(test);
			break;
		case 2:
			System.out.println("case2");
			
			fxBookTitle.setText("인생은 실전이다");
			fxBookAuthor.setText("신영준 외1명");
			
			test = ("출판사 서평\n\n〈인생은 실전이다〉\n\n"
					+ "혼돈의 시대에 살아남는 데 필요한 이야기를 담은 생존 에세이\r\n"
					+ "\r\n"
					+ "신영준과 주언규 두 저자는 소셜 미디어를 통해, 유튜브를 통해, 강연을 통해, 저서를 통해 많은 사람과 교류해왔다. 성공한 사람들을 인터뷰하고, 하루하루 열심히 살아가는 보통 사람의 이야기도 들었으며, 지금도 메일함에 수천 명의 사람들이 보내온 고민을 소중하게 보관하고 있다. 그 많은 소통의 결과 망하지 않고 살아남는 것이 중요하다는 결론에 이르렀고, 그 철학을 한 권의 책에 담아냈다.\r\n"
					+ "\r\n"
					+ "온몸으로 겪어내야 할 진짜 현실을 이야기하다\r\n"
					+ "안타깝지만, 인생에 예행연습은 없다. 졸업도, 취업도, 결혼도, 육아도 그 무엇 하나 연습해 볼 수 없다. 그래서 실전이 중요하다. 뜬구름 잡는 소리가 아니라, 온몸으로 겪어내야 할 진짜 현실을 이야기해야 한다.\r\n"
					+ "\r\n"
					+ "〈인생은 실전이다〉는 입시, 유학, 취업, 이직, 직장생활, 재테크, 인간관계, 자기관리 등 지금 고민에 빠진 사람들에게 실질적으로 필요한 정보와 지혜를 담았다. 우정, 사랑, 존중, 자존감 등 행복을 위한 생각도 놓치지 않았다. 포스트 코로나와 4차 산업혁명으로 불리는 혼돈의 시대에 우리가 행복하게 살아남을 방법을 〈인생은 실전이다〉에서 찾을 수 있을 것이다.\r\n"
					+ "\r\n"
					+ "[인터넷 교보문고 제공]");
			fxBookInfo.setText(test);
			break;
		case 3:
			System.out.println("case3");
			
			fxBookTitle.setText("작별하지 않는다");
			fxBookAuthor.setText("한강");
			
			test = ("출판사 서평\n\n〈작별하지 않는다〉\n\n"
					+ "무엇을 생각하면 견딜 수 있나.\r\n"
					+ "가슴에 활활 일어나는 불이 없다면.\r\n"
					+ "기어이 돌아가 껴안을 네가 없다면.\r\n"
					+ "\r\n"
					+ "이곳에 살았던 이들로부터, 이곳에 살아 있는 이들로부터\r\n"
					+ "꿈처럼 스며오는 지극한 사랑의 기억\r\n"
					+ "\r\n"
					+ "2016년 『채식주의자』로 인터내셔널 부커상을 수상하고 2018년 『흰』으로 같은 상 최종 후보에 오른 한강 작가의 5년 만의 신작 장편소설 『작별하지 않는다』가 출간되었다. 2019년 겨울부터 이듬해 봄까지 계간 『문학동네』에 전반부를 연재하면서부터 큰 관심을 모았고, 그뒤 일 년여에 걸쳐 후반부를 집필하고 또 전체를 공들여 다듬는 지난한 과정을 거쳐 완성되었다. 본래 「눈 한 송이가 녹는 동안」(2015년 황순원문학상 수상작), 「작별」(2018년 김유정문학상 수상작)을 잇는 ‘눈’ 3부작의 마지막 작품으로 구상되었으나 그 자체 완결된 작품의 형태로 엮이게 된바, 한강 작가의 문학적 궤적에서 『작별하지 않는다』가 지니는 각별한 의미를 짚어볼 수 있다. 이로써 『소년이 온다』(2014), 『흰』(2016), ‘눈’ 연작(2015, 2017) 등 근작들을 통해 어둠 속에서도 한줄기 빛을 향해 나아가는 인간의 고투와 존엄을 그려온 한강 문학이 다다른 눈부신 현재를 또렷한 모습으로 확인할 수 있게 되었다. 오래지 않은 비극적 역사의 기억으로부터 길어올린, 그럼에도 인간을 끝내 인간이게 하는 간절하고 지극한 사랑의 이야기가 눈이 시리도록 선연한 이미지와 유려하고 시적인 문장에 실려 압도적인 아름다움으로 다가온다.\r\n"
					+ "\r\n"
					+ "[인터넷 교보문고 제공]");
			fxBookInfo.setText(test);
			break;
		case 4:
			System.out.println("case4");
			
			fxBookTitle.setText("소크라테스 익스프레스");
			fxBookAuthor.setText("에릭 와이너");
			
			test = ("출판사 서평\n\n〈소크라테스 익스프레스〉\n\n"
					+ "“인생에서 길을 잃는 수많은 순간마다 이 철학자들의 목소리가 들려올 것이다”\r\n"
					+ "《소크라테스 익스프레스》는 마르쿠스 아우렐리우스부터 몽테뉴까지 역사상 가장 위대한 철학자들을 만나러 떠나는 여행기이자, 그들의 삶과 작품 속의 지혜가 우리 인생을 개선하는 데 어떻게 도움이 되는지 답을 찾아가는 책이다. 매력적인 글솜씨로 “빌 브라이슨의 유머와 알랭 드 보통의 통찰력이 만났다”는 평가를 받는 에릭 와이너가 이 여행의 동반자로 나선다.\r\n"
					+ "\r\n"
					+ "[인터넷 교보문고 제공]");
			fxBookInfo.setText(test);
			break;
		case 5:
			System.out.println("case5");
			
			fxBookTitle.setText("달러구트 꿈 백화점2");
			fxBookAuthor.setText("이미예");
			
			test = ("출판사 서평\n\n〈달러구트 꿈 백화점2〉\n\n"
					+ "100만 독자를 사로잡은 《달러구트 꿈 백화점》, 그 두 번째 이야기\r\n"
					+ "\r\n"
					+ "어느덧 페니가 달러구트 꿈 백화점에서 일한 지도 1년이 넘었다.\r\n"
					+ "\r\n"
					+ "재고가 부족한 꿈을 관리하고, 꿈값 창고에서 감정으로 가득 찬 병을 옮기고, 프런트의 수많은 눈꺼풀 저울을 관리하는 일에 능숙해진 페니는 자신감이 넘친다. 게다가 꿈 산업 종사자로 인정을 받아야만 드나들 수 있는 ‘컴퍼니 구역’에도 가게 된 페니는 기쁜 마음을 감출 수 없다.\r\n"
					+ "\r\n"
					+ "하지만 그곳에서 페니를 기다리고 있는 건, 꿈에 대한 불만을 털어놓는 사람들로 가득한 ‘민원관리국’이었다. 설상가상 달러구트는 아주 심각한 민원 하나를 통째로 페니에게 맡기는데…\r\n"
					+ "\r\n"
					+ "“왜 저에게서 꿈까지 뺏어가려고 하시나요?”라는 알쏭달쏭한 민원을 남기고 발길을 끊어버린 792번 단골손님.\r\n"
					+ "\r\n"
					+ "페니는 과연 달러구트 꿈 백화점의 오랜 단골손님을 되찾을 수 있을까?");
			fxBookInfo.setText(test);
			break;
		}
	}
	
	public void voted() {
		bs = new BookDTO();
		bsDB = new BestSellerDBService();
		
		bs.setbName((String)fxBookTitle.getText());
		System.out.println("책이름 : "+bs.getbName());
		String bName = bs.getbName();
		//bs.setbCount(1);
		
		//bsDB.bsCount((String)fxBookTitle.getText()); //DB에 카운트 1 추가
		bsDB.bsCount(bName); //DB에 카운트 1 추가
		ArrayList<BookDTO> list = bsDB.resultCount(); //DB에서 카운트수 뺴오기
		viewChart(list);
//		if(vote == 0) {
//		
//			if (bookNum == 1) {
//				vote = 1;
//				System.out.println("1 투표");
//			} else if (bookNum == 2) {
//				vote = 2;
//				System.out.println("2 투표");
//			} else if (bookNum == 3) {
//				vote = 3;
//				System.out.println("3 투표");
//			} else if (bookNum == 4) {
//				vote = 4;
//				System.out.println("4 투표");
//			} else if (bookNum == 5) {
//				vote = 5;
//				System.out.println("5 투표");
//			} else {
//				System.out.println("책0");
//			}
//			
//			//System.out.println(bs.getbName1());
//		}
//		else {
//			System.out.println("이미 투표를 하셨습니다");
//		}
	}
	
	public void viewChart(ArrayList<BookDTO> list) {
		int nCountList[] = new int[] {0,0,0,0,0};
		for (int i =0; i<list.size(); i++) {
			nCountList[i] = list.get(i).getbCount();
			//nCountList[list.get(i).getbCount()]++;
			//System.out.println(nCountList[i]);
		}
		XYChart.Series series1 = new XYChart.Series();
		series1.setName("오케팅");
		series1.setData(FXCollections.observableArrayList(new XYChart.Data("",nCountList[0])));
		
		XYChart.Series series2 = new XYChart.Series();
		series2.setName("인생은 실전이다");
		series2.setData(FXCollections.observableArrayList(new XYChart.Data("",nCountList[1])));
		
		XYChart.Series series3 = new XYChart.Series();
		series3.setName("작별하지 않는다");
		series3.setData(FXCollections.observableArrayList(new XYChart.Data("",nCountList[2])));
		
		XYChart.Series series4 = new XYChart.Series();
		series4.setName("소크라테스 익스프레스");
		series4.setData(FXCollections.observableArrayList(new XYChart.Data("",nCountList[3])));
		
		XYChart.Series series5 = new XYChart.Series();
		series5.setName("달러구트 꿈 백화점2");
		series5.setData(FXCollections.observableArrayList(new XYChart.Data("",nCountList[4])));
	
		barChart.getData().addAll(series1, series2, series3, series4, series5);
	}
	
}
