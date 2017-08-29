package com.ds.web.crawler.parser;

import com.ds.web.crawler.mongo.entity.HTMLPage;
import com.ds.web.crawler.mongo.entity.ParsedData;

public interface Parse {
	ParsedData parse(HTMLPage htmlPage);
}
