public String getMyTime() {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat df = new SimpleDateFormat(
				"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
		formattedDate = df.format(c.getTime());
		return formattedDate;
	}
