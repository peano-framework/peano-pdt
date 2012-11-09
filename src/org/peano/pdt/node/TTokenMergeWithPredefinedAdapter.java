/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.peano.pdt.node;

import org.peano.pdt.analysis.*;

@SuppressWarnings("nls")
public final class TTokenMergeWithPredefinedAdapter extends Token
{
    public TTokenMergeWithPredefinedAdapter()
    {
        super.setText("merge-with-predefined-mapping:");
    }

    public TTokenMergeWithPredefinedAdapter(int line, int pos)
    {
        super.setText("merge-with-predefined-mapping:");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TTokenMergeWithPredefinedAdapter(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTTokenMergeWithPredefinedAdapter(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TTokenMergeWithPredefinedAdapter text.");
    }
}