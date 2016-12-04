// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.online.surveylist;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class SurveyListFragment$$ViewBinder<T extends SurveyListFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558878, "field 'lv_surveys_list'");
    target.lv_surveys_list = finder.castView(view, 2131558878, "field 'lv_surveys_list'");
    view = finder.findRequiredView(source, 2131558877, "field 'surveySelectText'");
    target.surveySelectText = finder.castView(view, 2131558877, "field 'surveySelectText'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends SurveyListFragment> implements Unbinder {
    private T target;

    protected InnerUnbinder(T target) {
      this.target = target;
    }

    @Override
    public final void unbind() {
      if (target == null) throw new IllegalStateException("Bindings already cleared.");
      unbind(target);
      target = null;
    }

    protected void unbind(T target) {
      target.lv_surveys_list = null;
      target.surveySelectText = null;
    }
  }
}
