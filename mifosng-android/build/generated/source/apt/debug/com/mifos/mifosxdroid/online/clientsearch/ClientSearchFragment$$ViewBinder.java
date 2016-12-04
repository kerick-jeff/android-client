// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.online.clientsearch;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class ClientSearchFragment$$ViewBinder<T extends ClientSearchFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558719, "field 'et_searchById'");
    target.et_searchById = finder.castView(view, 2131558719, "field 'et_searchById'");
    view = finder.findRequiredView(source, 2131558722, "field 'results'");
    target.results = finder.castView(view, 2131558722, "field 'results'");
    view = finder.findRequiredView(source, 2131558720, "method 'performSearch'");
    unbinder.view2131558720 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.performSearch();
      }
    });
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends ClientSearchFragment> implements Unbinder {
    private T target;

    View view2131558720;

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
      target.et_searchById = null;
      target.results = null;
      view2131558720.setOnClickListener(null);
    }
  }
}
