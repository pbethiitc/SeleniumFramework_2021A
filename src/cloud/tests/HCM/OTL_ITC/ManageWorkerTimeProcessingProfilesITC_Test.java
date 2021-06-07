package cloud.tests.OTL;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import cloud.components.OTL.ManageWorkerTimeProcessingProfilesITC;
import cloud.components.common.Login;
import itc.framework.BaseTest;

public class ManageWorkerTimeProcessingProfilesITC_Test extends BaseTest{
	
	@BeforeTest
	public void start(){
		startUp("chrome", this.getClass().getSimpleName()); 
	}

	@Test
	@Parameters({ "dataFile" ,"sheet","scenario"})
	public void executeTest(String dataFile1,String sheet1,String scenario1) throws Exception{
		testDataFile = dataFile1;
		scenario = scenario1;
		testsheet = sheet1;
		Login.run(1);
		ManageWorkerTimeProcessingProfilesITC.run(1);
	}
	@AfterTest
	public void end(){
		close();
	}
}
