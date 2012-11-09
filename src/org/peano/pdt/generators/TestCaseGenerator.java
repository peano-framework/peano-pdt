package org.peano.pdt.generators;

import org.peano.framework.analysis.DepthFirstAdapter;

import de.tum.peano.pdt.node.*;

public class TestCaseGenerator extends DepthFirstAdapter {
  private org.peano.pdt.generators.DirectoryGenerator _directoryGenerator;
  private org.peano.pdt.TranslationTable              _translationTable;

  public TestCaseGenerator(
    org.peano.pdt.generators.DirectoryGenerator  directoryGenerator,
    org.peano.pdt.TranslationTable               translationTable
  ) {
    _directoryGenerator   = directoryGenerator;
    _translationTable     = translationTable;
  }


  public void inADescription(ADescription node) {
    _translationTable.convertTemplateFile( 
      "TestCaseHeader.template",
      _directoryGenerator.getTestsDirectory() + "/TestCase.h",
      false
    );
    _translationTable.convertTemplateFile( 
      "TestCaseImplementation.template",
      _directoryGenerator.getTestsDirectory() + "/TestCase.cpp",
      false
    );
  }
}
