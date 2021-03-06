package com.udacity.gradle.builditbigger;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static android.support.test.espresso.action.ViewActions.click;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;
import com.udacity.gradle.builditbigger.R;

@RunWith(AndroidJUnit4.class)
public class AsyncTaskTest {
    @Rule
  public   ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);
     @Test
    public void asyncTaskValidation(){
         Espresso.onView(withId(R.id.jokeButton)).perform(click());    //.perform(click());
        Espresso.onView(withId(R.id.joke_tv)).check(matches(not(withText("Error"))));

    }
}
