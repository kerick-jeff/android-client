// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.online;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class SurveyQuestionActivity$$ViewBinder<T extends SurveyQuestionActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558548, "field 'mViewPager'");
    target.mViewPager = finder.castView(view, 2131558548, "field 'mViewPager'");
    view = finder.findRequiredView(source, 2131558549, "field 'btnNext' and method 'onClickButtonNext'");
    target.btnNext = finder.castView(view, 2131558549, "field 'btnNext'");
    unbinder.view2131558549 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickButtonNext();
      }
    });
    view = finder.findRequiredView(source, 2131558550, "field 'tv_surveyEmpty'");
    target.tv_surveyEmpty = finder.castView(view, 2131558550, "field 'tv_surveyEmpty'");
    view = finder.findRequiredView(source, 2131558534, "field 'mToolbar'");
    target.mToolbar = finder.castView(view, 2131558534, "field 'mToolbar'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends SurveyQuestionActivity> implements Unbinder {
    private T target;

    View view2131558549;

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
      target.mViewPager = null;
      view2131558549.setOnClickListener(null);
      target.btnNext = null;
      target.tv_surveyEmpty = null;
      target.mToolbar = null;
    }
  }
}
