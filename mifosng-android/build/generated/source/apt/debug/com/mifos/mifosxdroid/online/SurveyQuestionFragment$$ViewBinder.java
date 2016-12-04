// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.online;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class SurveyQuestionFragment$$ViewBinder<T extends SurveyQuestionFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558879, "field 'tv_question'");
    target.tv_question = finder.castView(view, 2131558879, "field 'tv_question'");
    view = finder.findRequiredView(source, 2131558880, "field 'radioGroupAnswer'");
    target.radioGroupAnswer = finder.castView(view, 2131558880, "field 'radioGroupAnswer'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends SurveyQuestionFragment> implements Unbinder {
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
      target.tv_question = null;
      target.radioGroupAnswer = null;
    }
  }
}
