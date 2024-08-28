package br.com.fabriciocurvello.appcalculadoracimatecjava;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;

public class ClaculadoraUiTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void AdicaoTestUi() {
        Espresso.onView(ViewMatchers.withId(R.id.et_numero1)).perform(ViewActions.replaceText("2"));
        pausa(1);
        Espresso.onView(ViewMatchers.withId(R.id.et_numero2)).perform(ViewActions.replaceText("3"));
        pausa(1);
        Espresso.onView(ViewMatchers.withId(R.id.sp_operacao)).perform(ViewActions.click());
        pausa(1);
        Espresso.onView(ViewMatchers.withText("Adição")).perform(ViewActions.click());
        pausa(1);
        Espresso.onView(ViewMatchers.withId(R.id.bt_calcular)).perform(ViewActions.click());
        pausa(1);
        Espresso.onView(ViewMatchers.withId(R.id.tv_resultado)).check(ViewAssertions.matches(ViewMatchers.withText("5.0")));
        pausa(3);

    }

    //Elabore testes Ui para subtração, multiplicação e divisão

    public void pausa(long segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
