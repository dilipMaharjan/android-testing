package com.android.dmaharjan.androidtesting;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


/**
 * Created by dmaharjan on 2/28/17.
 */

public class MainAcitivityInstrumentedTest {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule=new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void sayHello(){
        onView(withId(R.id.buttonSayHello)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Hello")));
    }
}
