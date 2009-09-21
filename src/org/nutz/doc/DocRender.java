package org.nutz.doc;

import java.io.File;
import java.io.IOException;

import org.nutz.doc.meta.ZDoc;

public interface DocRender {

	void render(File file, ZDoc doc) throws IOException;

}
