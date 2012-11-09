/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.peano.pdt.analysis;

import java.util.*;
import org.peano.pdt.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    public void caseADescription(ADescription node)
    {
        defaultCase(node);
    }

    public void caseARepository(ARepository node)
    {
        defaultCase(node);
    }

    public void caseAVertex(AVertex node)
    {
        defaultCase(node);
    }

    public void caseAReadScalarOperation(AReadScalarOperation node)
    {
        defaultCase(node);
    }

    public void caseAReadVectorOperation(AReadVectorOperation node)
    {
        defaultCase(node);
    }

    public void caseAReadVectorTwoPowDOperation(AReadVectorTwoPowDOperation node)
    {
        defaultCase(node);
    }

    public void caseAReadStencilOperation(AReadStencilOperation node)
    {
        defaultCase(node);
    }

    public void caseAWriteScalarOperation(AWriteScalarOperation node)
    {
        defaultCase(node);
    }

    public void caseAWriteVectorOperation(AWriteVectorOperation node)
    {
        defaultCase(node);
    }

    public void caseAWriteVectorTwoPowDOperation(AWriteVectorTwoPowDOperation node)
    {
        defaultCase(node);
    }

    public void caseAWriteStencilOperation(AWriteStencilOperation node)
    {
        defaultCase(node);
    }

    public void caseACell(ACell node)
    {
        defaultCase(node);
    }

    public void caseAState(AState node)
    {
        defaultCase(node);
    }

    public void caseAEventMapping(AEventMapping node)
    {
        defaultCase(node);
    }

    public void caseAAdapter(AAdapter node)
    {
        defaultCase(node);
    }

    public void caseTTokenVertex(TTokenVertex node)
    {
        defaultCase(node);
    }

    public void caseTTokenCell(TTokenCell node)
    {
        defaultCase(node);
    }

    public void caseTTokenState(TTokenState node)
    {
        defaultCase(node);
    }

    public void caseTTokenComponent(TTokenComponent node)
    {
        defaultCase(node);
    }

    public void caseTTokenNamespace(TTokenNamespace node)
    {
        defaultCase(node);
    }

    public void caseTTokenRead(TTokenRead node)
    {
        defaultCase(node);
    }

    public void caseTTokenWrite(TTokenWrite node)
    {
        defaultCase(node);
    }

    public void caseTTokenScalar(TTokenScalar node)
    {
        defaultCase(node);
    }

    public void caseTTokenVectorD(TTokenVectorD node)
    {
        defaultCase(node);
    }

    public void caseTTokenVectorTwoPowD(TTokenVectorTwoPowD node)
    {
        defaultCase(node);
    }

    public void caseTTokenStencil(TTokenStencil node)
    {
        defaultCase(node);
    }

    public void caseTTokenName(TTokenName node)
    {
        defaultCase(node);
    }

    public void caseTTokenDastgenFile(TTokenDastgenFile node)
    {
        defaultCase(node);
    }

    public void caseTTokenEventMapping(TTokenEventMapping node)
    {
        defaultCase(node);
    }

    public void caseTTokenAdapter(TTokenAdapter node)
    {
        defaultCase(node);
    }

    public void caseTTokenMergeWithUserDefinedAdapter(TTokenMergeWithUserDefinedAdapter node)
    {
        defaultCase(node);
    }

    public void caseTTokenMergeWithPredefinedAdapter(TTokenMergeWithPredefinedAdapter node)
    {
        defaultCase(node);
    }

    public void caseTBlank(TBlank node)
    {
        defaultCase(node);
    }

    public void caseTIdentifier(TIdentifier node)
    {
        defaultCase(node);
    }

    public void caseTFilename(TFilename node)
    {
        defaultCase(node);
    }

    public void caseTNamespace(TNamespace node)
    {
        defaultCase(node);
    }

    public void caseTTraditionalComment(TTraditionalComment node)
    {
        defaultCase(node);
    }

    public void caseTDocumentationComment(TDocumentationComment node)
    {
        defaultCase(node);
    }

    public void caseTEndOfLineComment(TEndOfLineComment node)
    {
        defaultCase(node);
    }

    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}