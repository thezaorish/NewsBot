package com.zaorish.newsbot.web

import org.springframework.stereotype.Component

import java.text.DateFormat

/**
 * Created by zaorish on 4/27/14.
 */
@Component
class DateProvider {

    String provideDate() {
        Date date = new Date()
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG)
        String formattedDate = dateFormat.format(date)
        formattedDate
    }

}
