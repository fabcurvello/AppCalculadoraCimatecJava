package br.com.fabriciocurvello.appcalculadoracimatecjava;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class CalculadoraUiBasicTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testTextFieldInput() {
        // Verifica se o campo de texto está permitindo entrada de texto
        pausa(1);
        Espresso.onView(ViewMatchers.withId(R.id.et_numero1)).perform(ViewActions.typeText("5"));
        pausa(2);
        Espresso.onView(ViewMatchers.withId(R.id.et_numero1)).check(ViewAssertions.matches(
                ViewMatchers.withText("5")));
        pausa(2);
    }

    public void pausa(long segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
