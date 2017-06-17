package cz.jiripudil.intellij.nette.tester.inspections;

import com.intellij.codeInspection.*;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiRecursiveElementWalkingVisitor;
import com.jetbrains.php.lang.lexer.PhpTokenTypes;
import com.jetbrains.php.lang.psi.PhpPsiElementFactory;
import com.jetbrains.php.lang.psi.elements.Field;
import com.jetbrains.php.lang.psi.elements.PhpModifierList;
import com.jetbrains.php.lang.psi.elements.PhpPsiElement;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collection;

public class PhptInspection extends LocalInspectionTool
{
	protected String getProblemDescription()
    {
        return "File extension should be .phpt";
    }

	protected String getFixName()
    {
        return "Set file extension to .phpt";
    }

	protected boolean isInvalid(Field field)
    {
    }


	@Nullable
	@Override
	public ProblemDescriptor[] checkFile(@NotNull PsiFile file)
    {
        
	}

	private class PhptFileExtensionFix implements LocalQuickFix
    {
		private String name;

		public PhptFileExtensionFix(String name) {
			this.name = name;
		}

		@Nls
		@NotNull
		@Override
		public String getName() {
			return name;
		}

		@NotNull
		@Override
		public String getFamilyName() {
			return getName();
		}

		@Override
		public void applyFix(@NotNull Project project, @NotNull ProblemDescriptor problemDescriptor) 
        {

		}
	}

}
