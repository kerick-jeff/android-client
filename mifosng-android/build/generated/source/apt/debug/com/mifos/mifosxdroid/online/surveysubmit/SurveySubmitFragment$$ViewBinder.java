// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.online.surveysubmit;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class SurveySubmitFragment$$ViewBinder<T extends SurveySubmitFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558876, "field 'btn_submit' and method 'submitScore'");
    target.btn_submit = finder.castView(view, 2131558876, "field 'btn_submit'");
    unbinder.view2131558876 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.submitScore();
      }
    });
    view = finder.findRequiredView(source, 2131558875, "field 'tv_submit'");
    target.tv_submit = finder.castView(view, 2131558875, "field 'tv_submit'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends SurveySubmitFragment> implements Unbinder {
    private T target;

    View view2131558876;

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
      view2131558876.setOnClickListener(null);
      target.btn_submit = null;
      target.tv_submit = null;
    }
  }
}
