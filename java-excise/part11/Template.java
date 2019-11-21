package com.itranswarp.learnjava;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Template {
	
	final String template;
	final Pattern pattern = Pattern.compile("\\$\\{(\\w+)\\}");

	public Template(String template) {
		this.template = template;
	}

	public String render(Map<String, Object> data) {
		Matcher m = pattern.matcher(template);
		StringBuffer sb = new StringBuffer();
		while (m.find()) {
			String subSequence = template.substring(m.start(),m.end());
			Matcher m2 = pattern.matcher(subSequence);
			if(m2.matches()) {
				m.appendReplacement(sb, data.get(m2.group(1)).toString());
			}
		}
		m.appendTail(sb);
		return sb.toString();
	}

}