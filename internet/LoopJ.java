		but1.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				AsyncHttpClient client = new AsyncHttpClient();
				but1.setText("fuuuu");
				String str_url="http://ispacevm16.researchstudio.at/ArcGIS/rest/services/haufe/GetQuestion/MapServer/0/query?text=&geometry=&geometryType=esriGeometryPoint&inSR=&spatialRel=esriSpatialRelIntersects&relationParam=&objectIds=3&where=&time=&returnCountOnly=false&returnIdsOnly=false&returnGeometry=true&maxAllowableOffset=&outSR=&outFields=&f=json";
				client.get(str_url, new AsyncHttpResponseHandler() {
				    @Override
				    public void onSuccess(String response) {
				        System.out.println(response);
				    }
				});
				
			}
		});
