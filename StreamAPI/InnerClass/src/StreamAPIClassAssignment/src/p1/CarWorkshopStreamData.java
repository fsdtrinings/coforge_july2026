package p1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CarWorkshopStreamData {

	 List<CarWorkshopJob>  allcarjobs = new ArrayList<>();
	 
	 public CarWorkshopStreamData()
	 {
		 allcarjobs.add(new CarWorkshopJob( /* ---  write some data inside constructor */));
	 }
	
	 
	 public List<CarWorkshopJob> getAllCarJobsByDate(LocalDate date1)
	 {
		 /**
		  * use stream API to extract the carjobs and collect in the Arraylist 
		  * apply filter over date
		  * */
	 }
	 public List<CarWorkshopJob> getAllCarJobsByDate(LocalDate date1,LocalDate date2)
	 {
		 /**  overloaded method , works on Date range
		  * use stream API to extract the carjobs and collect in the Arraylist 
		  * apply filter over date
		  * */
	 }
	 
	 public Map<LocalDate, List<CarWorkshopJob>> groupCarWorkJobBydate()
	 {
		 /**
		  * Group all the list data , based on date
		  *     grouping
		  * **/
		 
	 }
	 
	 
	 public List<CarWorkshopJob> getAllJobsByPrice(int price)
	 {
		 /**
		  * get all the jobs , higher than the given price
		  * 
		  * */
		 
	 }
	 
	 
	 
	
	
}
