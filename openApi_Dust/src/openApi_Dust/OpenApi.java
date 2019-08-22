package openApi_Dust;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;




public class OpenApi {
	 public static void main(String[] args) {

//	        try{
//	            //파일 객체 생성
//	        	 String path = OpenApi.class.getResource("").getPath();
//	        	System.out.println(path);
////	        	File file = new File("C:\\java_project\\openApi_Dust\\src\\openApi_Dust\\key.txt");
//	        	File file = new File("/C:/java_project/openApi_Dust/bin/openApi_Dust/key.txt");
////	        	File file = new File(path+"key.txt");
//	        	System.out.println(path+"key2.txt");
//	            
//	        	//입력 스트림 생성
//	            FileReader filereader = new FileReader(file);
//	            //입력 버퍼 생성
//	            BufferedReader bufReader = new BufferedReader(filereader);
//	            String line = "";
//	            System.out.println("D");
//	            while((line = bufReader.readLine()) != null){
////	            	System.out.println("A");
//	                System.out.println(line);
//	            }
////	            System.out.println("C");
//	            //.readLine()은 끝에 개행문자를 읽지 않는다.            
//	            bufReader.close();
//	        }catch (FileNotFoundException e) {
//	            // TODO: handle exception
//	        }catch(IOException e){
//	            System.out.println(e);
//	        }


	        BufferedReader br;
	        try{            
	        	String suburl = "경기";
	       
	        	String serviceKey = "B63o9VNgdLlYtTfd0h2mvZPtIj1BlXMV0bAKTMstOKSlwJDVadQj3AnlaA8D3clmjipXllP28GVdk2RbAweVXg%3D%3D";
	        	suburl = URLEncoder.encode(suburl, "UTF-8");
	        	String urlstr1 = "http://openapi.airkorea.or.kr/"
	        			+"openapi/services/rest/ArpltnInforInqireSvc/getCtprvnMesureSidoLIst"		
	        			+"?serviceKey="
	        			+ serviceKey
	        			+"&numOfRows=30"
	        			+"&pageNo=1"
	        			+"&sidoName="
	        			+suburl
	        			+"&searchCondition=DAILY";
	        	
	        	// 시도별 실시간 평균정보 조회
	        	String urlstr2 = "http://openapi.airkorea.or.kr/"
	        			+"openapi/services/rest/ArpltnInforInqireSvc/getCtprvnMesureLIst"
	        			+"?serviceKey=B63o9VNgdLlYtTfd0h2mvZPtIj1BlXMV0bAKTMstOKSlwJDVadQj3AnlaA8D3clmjipXllP28GVdk2RbAweVXg%3D%3D"
	        			+"&numOfRows=10"
	        			+ "&pageNo=1"
	        			+ "&itemCode=PM10"
	        			+ "&dataGubun=HOUR"
	        			+ "&searchCondition=MONTH";
	        	
	            URL url = new URL(urlstr1);
	            HttpURLConnection urlconnection = (HttpURLConnection) url.openConnection();
	            urlconnection.setRequestMethod("GET");
	            br = new BufferedReader(new InputStreamReader(urlconnection.getInputStream(),"UTF-8"));
	            String result = "";
	            String line;
	            while((line = br.readLine()) != null) {
	                result = result + line + "\n";
	            }
	            System.out.println(result);
	        }catch(Exception e){
	            System.out.println(e.getMessage());
	        }
	    }

}
