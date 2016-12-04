// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.online.documentlist;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class DocumentListFragment$$ViewBinder<T extends DocumentListFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558755, "field 'rv_documents'");
    target.rv_documents = finder.castView(view, 2131558755, "field 'rv_documents'");
    view = finder.findRequiredView(source, 2131558678, "field 'swipeRefreshLayout'");
    target.swipeRefreshLayout = finder.castView(view, 2131558678, "field 'swipeRefreshLayout'");
    view = finder.findRequiredView(source, 2131558757, "field 'mNoChargesText'");
    target.mNoChargesText = finder.castView(view, 2131558757, "field 'mNoChargesText'");
    view = finder.findRequiredView(source, 2131558756, "field 'mNoChargesIcon' and method 'reloadOnError'");
    target.mNoChargesIcon = finder.castView(view, 2131558756, "field 'mNoChargesIcon'");
    unbinder.view2131558756 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.reloadOnError();
      }
    });
    view = finder.findRequiredView(source, 2131558681, "field 'll_error'");
    target.ll_error = finder.castView(view, 2131558681, "field 'll_error'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends DocumentListFragment> implements Unbinder {
    private T target;

    View view2131558756;

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
      target.rv_documents = null;
      target.swipeRefreshLayout = null;
      target.mNoChargesText = null;
      view2131558756.setOnClickListener(null);
      target.mNoChargesIcon = null;
      target.ll_error = null;
    }
  }
}
