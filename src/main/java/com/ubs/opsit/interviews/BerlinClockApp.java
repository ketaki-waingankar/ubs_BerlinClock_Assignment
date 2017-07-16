package com.ubs.opsit.interviews;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ubs.opsit.exception.ValidationException;
import com.ubs.opsit.factory.BerlinClockBuilderFactory;
import com.ubs.opsit.util.CommonUtil;

/**
 * Concrete implementation of TimeConverter.
 * 
 * @author ketaki-waingankar
 *
 */
public class BerlinClockApp implements TimeConverter {

	private final static Logger logger = LoggerFactory.getLogger(BerlinClockApp.class);
	
	/*public static void main(String[] args) {
		try {

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter time");
			String inputTime = sc.next();

			sc.close();

			System.out.println(new BerlinClockApp().convertTime(inputTime));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}*/

	/* (non-Javadoc)
	 * @see com.ubs.opsit.interviews.TimeConverter#convertTime(java.lang.String)
	 */
	@Override
	public String convertTime(String aTime) {
		try {
			return BerlinClockBuilderFactory
					.createGraphicBerlinClock(CommonUtil.convertTimeToBerlinClock(aTime)).toString();
		} catch (ValidationException e) {
			logger.error(e.getMessage());
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return null;
	}

}
