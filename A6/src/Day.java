
public class Day {

	String day;
	String []days = {"Sunday","Monday","Tuesday","Wednesday","Thusday","Friday","Saturday"};
	
	public Day(String day){
		
		this.day = day;
		
	}
	public void Day(){
		
		this.day = "Monday";
	}

	@Override
	public String toString() {
		return "Day: " + day;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}
	public String nextDay(){
		String message = "";
		
		int dayindex = getDayIndex(this.day);
		if(dayindex!=-2){
			int truedayindex = dayindex + 1;
			if(truedayindex!=7)
			message = days[truedayindex];
			else
			message = days[0];
		}else{
		
		message =  "Invalid day";	
		}
		return message;
		
		
	}
	public String previousDay(){
		
		String message = "";
		
		int dayindex = getDayIndex(this.day);
		if(dayindex!=-2){
			int truedayindex = dayindex - 1;
			if(truedayindex!=-1)
			message = days[truedayindex];
			else
			message = days[6];
		}else{
		
		message =  "Invalid day";	
		}
		return message;
		
		
	}
	
	public String calculateDay(int numdays){
		String message = "";
		
		int dayindex = getDayIndex(this.day);
		int truedayindex = dayindex;
		if(dayindex!=-2){
			int x = 0;
			while(x<numdays){
			truedayindex = truedayindex + 1;
			
			if(truedayindex==7){
		
			truedayindex = 0;
			}
			x++;
			}
			message = days[truedayindex];
			
		}else{
		
		message =  "Invalid day";	
		}
		return message;
		
		
	}
		
	
	
	private int getDayIndex(String day){
		
		for(int i = 0; i<day.length(); i++){
			
			if(days[i]==this.day){
				
				return i;
			}
		}
		return -2;
	}
		
		
		
	}
	

