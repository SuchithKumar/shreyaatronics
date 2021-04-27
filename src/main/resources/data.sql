--Inserting single pole toggle_switches
INSERT INTO public.toggle_switch (amps_10,amps_15,amps_20,amps_6,description,pole_type) VALUES
	 ('726-2211','726-3211','726-4211','726-1211','SPST (ON-OFF)','Single Pole'),
	 ('726-2212','726-3212','726-4212','726-1212','SPDT (ON-OFF)','Single Pole'),
	 ('726-2213','726-3213','726-4213','726-1213','SPDT (ON-OFF-ON)','Single Pole'),
	 ('726-2214','726-3214','726-4214','726-1214','SPDT ON-ON(MOM)','Single Pole'),
	 ('726-2215','726-3215','726-4215','726-1215','SPDT ON-OFF-ON(MOM)','Single Pole'),
	 ('726-2216','726-3216','726-4216','726-1216','SPDT ON(MOM)-OFF-ON(MOM)','Single Pole'),
	 ('726-2219','726-3219','726-4219','726-1219','SPDT (ON-ON-ON)','Single Pole');
	 
--Inserting Double pole toggle_switches	 
INSERT INTO public.toggle_switch (amps_10,amps_15,amps_20,amps_6,description,pole_type) VALUES
	 ('726-2221','726-3221','726-4221','726-1221','DPST (ON-OFF)','Double Pole'),
	 ('726-2222','726-3222','726-4222','726-1222','DPDT (ON-OFF)','Double Pole'),
	 ('726-2223','726-3223','726-4223','726-1223','DPDT (ON-OFF-ON)','Double Pole'),
	 ('726-2224','726-3224','726-4224','726-1224','DPDT ON-ON(MOM)','Double Pole'),
	 ('726-2225','726-3225','726-4225','726-1225','DPDT ON-OFF-ON(MOM)','Double Pole'),
	 ('726-2226','726-3226','726-4226','726-1226','DPDT ON(MOM)-OFF-ON(MOM)','Double Pole'),
	 ('726-2229','726-3229','726-4229','726-1229','DPDT (ON-ON-ON)','Double Pole');
	 
--Inserting Triple pole toggle_switches
INSERT INTO public.toggle_switch (amps_10,amps_15,amps_20,amps_6,description,pole_type) VALUES
	 ('726-2231','726-3231','726-4231','726-1231','TPST (ON-OFF)','Triple Pole'),
	 ('726-2232','726-3232','726-4232','726-1232','TPDT (ON-OFF)','Triple Pole'),
	 ('726-2233','726-3233','726-4233','726-1233','TPDT (ON-OFF-ON)','Triple Pole'),
	 ('726-2234','726-3234','726-4234','726-1234','TPDT ON-ON(MOM)','Triple Pole'),
	 ('726-2235','726-3235','726-4235','726-1235','TPDT ON-OFF-ON(MOM)','Triple Pole'),
	 ('726-2236','726-3236','726-4236','726-1236','TPDT ON(MOM)-OFF-ON(MOM)','Triple Pole'),
	 ('726-2239','726-3239','726-4239','726-1239','TPDT (ON-ON-ON)','Triple Pole');
	 
--Inserting Four pole toggle_switches
INSERT INTO public.toggle_switch (amps_10,amps_15,amps_20,amps_6,description,pole_type) VALUES
	 ('726-2241','726-3241','726-4241','726-1241','FPST (ON-OFF)','Four Pole'),
	 ('726-2242','726-3242','726-4242','726-1242','FPDT (ON-OFF)','Four Pole'),
	 ('726-2243','726-3243','726-4243','726-1243','FPDT (ON-OFF-ON)','Four Pole'),
	 ('726-2244','726-3244','726-4244','726-1244','FPDT ON-ON(MOM)','Four Pole'),
	 ('726-2245','726-3245','726-4245','726-1245','FPDT ON-OFF-ON(MOM)','Four Pole'),
	 ('726-2246','726-3246','726-4246','726-1246','FPDT ON(MOM)-OFF-ON(MOM)','Four Pole'),
	 ('726-2249','726-3249','726-4249','726-1249','FPDT (ON-ON-ON)','Four Pole');