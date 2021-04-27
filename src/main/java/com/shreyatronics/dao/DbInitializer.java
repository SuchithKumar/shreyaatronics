package com.shreyatronics.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.shreyatronics.entities.ToggleSwitch;

@Component
public class DbInitializer implements CommandLineRunner {

	@Autowired
	private ToggleSwitchRepo toggleSwitchRepo;
	
	@Override
	public void run(String... args) throws Exception {
	
//			toggleSwitchRepo.save(new ToggleSwitch("SPST (ON-OFF)", "Single Pole", "726-1211", "726-2211", "726-3211", "726-4211"));
//			toggleSwitchRepo.save(new ToggleSwitch("SPDT (ON-OFF)", "Single Pole", "726-1212", "726-2212", "726-3212", "726-4212"));
//			toggleSwitchRepo.save(new ToggleSwitch("SPDT (ON-OFF-ON)", "Single Pole", "726-1213", "726-2213", "726-3213", "726-4213"));
//			toggleSwitchRepo.save(new ToggleSwitch("SPDT ON-ON(MOM)", "Single Pole", "726-1214", "726-2214", "726-3214", "726-4214"));
//			toggleSwitchRepo.save(new ToggleSwitch("DT ON-OFF-ON(MOM)", "Single Pole", "726-1215", "726-2215", "726-3215", "726-4215"));
//			toggleSwitchRepo.save(new ToggleSwitch("ON(MOM)-OFF-ON(MOM)", "Single Pole", "726-1216", "726-2216", "726-3216", "726-4216"));
//			toggleSwitchRepo.save(new ToggleSwitch("SPDT (ON-ON-ON)", "Single Pole", "726-1219", "726-2219", "726-3219", "726-4219"));
			
	
	}

}
