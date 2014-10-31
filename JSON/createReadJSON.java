http://developer.android.com/reference/org/json/JSONObject.html
		
		JSONObject jobj=new JSONObject();
		JSONArray jarray = new JSONArray();
		JSONObject jhash = new JSONObject();
		try {
			jobj.put("name", "GeoZilla");
			jobj.put("array", jarray);
			jarray.put(0, "zero");
			jarray.put(1, "uno"); 
			jobj.put("hash", jhash);
			jhash.put("0", "0 zero");
			jhash.put("1", "1 uno");
			
			/*
			{ jobj.toString(indent 2);
				"hash": {
					"1": "1 uno",
					"0": "0 zero"
				},
				"array": ["zero",	"uno"],
				"name": "GeoZilla"
			}
			*/

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(jobj);
		try {
			String name = jobj.getString("name").toString();
			System.out.println(name);
			String stray = jobj.getJSONArray("array").getString(0);
			System.out.println(stray);
			String strash = jobj.getJSONObject("hash").getString("1");
			System.out.println(strash);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		startActivity(intent);
	
