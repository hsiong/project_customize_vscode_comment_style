/**
 * Copyright (C), 2006-2022,
 *
 * @FileName: VsCodeStyle
 * @Author: Hsiong
 * @Date: 2022/6/7 11:29
 * @Description: History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package util;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 〈〉
 *
 * @author JF
 * @create 2022/6/7
 * @since 1.0.0
 */
public class VsCodeStyleUtil {

    @Test
    public void retainVsTest() {

        /**
         * 初始化
         */
        String str_singleLineH5 = "singleLineH5";
        String str_singleLineCode = "singleLineCode";
        String str_multiLine = "multiLine";
        String str_block = "block";

        // html - Single-line  <!-- -->
        List<String> singleLineH5List = this.getList("punctuation.definition.comment.html\n" +
                                                     "comment.block.html.vue-html\n" +
                                                     "meta.embedded.block.vue-html\n" +
                                                     "meta.block.template.vue\n" +
                                                     "source.vue");
        List<String> singleLineH5ContentList = this.getList("comment.block.html.vue-html\n" +
                                                            "meta.embedded.block.vue-html\n" +
                                                            "meta.block.template.vue\n" +
                                                            "source.vue");
        List<String> singleLineCssList = this.getList("meta.embedded.block.css\n" +
                                                      "meta.block.style.vue\n" +
                                                      "source.vue");
        List<String> singleLineCssContentList = this.getList("meta.selector.css\n" +
                                                             "meta.embedded.block.css\n" +
                                                             "meta.block.style.vue\n" +
                                                             "source.vue");
        List<String> singleLineH5TotalList = Lists.newArrayList();
        singleLineH5TotalList.addAll(singleLineH5List);
        singleLineH5TotalList.addAll(singleLineH5ContentList);
        singleLineH5TotalList.addAll(singleLineCssList);
        singleLineH5TotalList.addAll(singleLineCssContentList);

        // code - Single-line //
        List<String> singleLineJsList = this.getList("punctuation.definition.comment.js\n" +
                                                     "comment.line.double-slash.js\n" +
                                                     "meta.block.js\n" +
                                                     "meta.method.declaration.js\n" +
                                                     "meta.objectliteral.js\n" +
                                                     "meta.object.member.js\n" +
                                                     "meta.objectliteral.js\n" +
                                                     "meta.export.default.js\n" +
                                                     "meta.embedded.block.javascript\n" +
                                                     "meta.block.script.vue\n" +
                                                     "source.vue");
        List<String> singleLineJsContentList = this.getList("comment.line.double-slash.js\n" +
                                                            "meta.block.js\n" +
                                                            "meta.method.declaration.js\n" +
                                                            "meta.objectliteral.js\n" +
                                                            "meta.object.member.js\n" +
                                                            "meta.objectliteral.js\n" +
                                                            "meta.export.default.js\n" +
                                                            "meta.embedded.block.javascript\n" +
                                                            "meta.block.script.vue\n" +
                                                            "source.vue");
        List<String> singleLineCodeTotalList = Lists.newArrayList();
        singleLineCodeTotalList.addAll(singleLineJsList);
        singleLineCodeTotalList.addAll(singleLineJsContentList);

        // Multi-line /*  */
        List<String> multiLineJsList = this.getList("punctuation.definition.comment.js\n" +
                                                    "comment.block.js\n" +
                                                    "meta.block.js\n" +
                                                    "meta.method.declaration.js\n" +
                                                    "meta.objectliteral.js\n" +
                                                    "meta.object.member.js\n" +
                                                    "meta.objectliteral.js\n" +
                                                    "meta.export.default.js\n" +
                                                    "meta.embedded.block.javascript\n" +
                                                    "meta.block.script.vue\n" +
                                                    "source.vue");
        List<String> multiLineContentJsList = this.getList("comment.block.js\n" +
                                                           "meta.block.js\n" +
                                                           "meta.method.declaration.js\n" +
                                                           "meta.objectliteral.js\n" +
                                                           "meta.object.member.js\n" +
                                                           "meta.objectliteral.js\n" +
                                                           "meta.export.default.js\n" +
                                                           "meta.embedded.block.javascript\n" +
                                                           "meta.block.script.vue\n" +
                                                           "source.vue");
        List<String> multiLineTotalList = Lists.newArrayList();
        multiLineTotalList.addAll(multiLineJsList);
        multiLineTotalList.addAll(multiLineContentJsList);

        // Block /**  */
        List<String> blockJsList = this.getList("punctuation.definition.comment.js\n" +
                                                "comment.block.documentation.js\n" +
                                                "meta.objectliteral.js\n" +
                                                "meta.object.member.js\n" +
                                                "meta.objectliteral.js\n" +
                                                "meta.export.default.js\n" +
                                                "meta.embedded.block.javascript\n" +
                                                "meta.block.script.vue\n" +
                                                "source.vue");
        List<String> blockJsContentList = this.getList("comment.block.documentation.js\n" +
                                                       "meta.objectliteral.js\n" +
                                                       "meta.object.member.js\n" +
                                                       "meta.objectliteral.js\n" +
                                                       "meta.export.default.js\n" +
                                                       "meta.embedded.block.javascript\n" +
                                                       "meta.block.script.vue\n" +
                                                       "source.vue");
        List<String> blockCssList = this.getList("punctuation.definition.comment.begin.css\n" +
                                                 "comment.block.css\n" +
                                                 "meta.embedded.block.css\n" +
                                                 "meta.block.style.vue\n" +
                                                 "source.vue");
        List<String> blockCssContentList = this.getList("comment.block.css\n" +
                                                        "meta.embedded.block.css\n" +
                                                        "meta.block.style.vue\n" +
                                                        "source.vue");
        List<String> blockTotalList = Lists.newArrayList();
        blockTotalList.addAll(blockJsList);
        blockTotalList.addAll(blockJsContentList);
        blockTotalList.addAll(blockCssList);
        blockTotalList.addAll(blockCssContentList);

        /**
         * 获取结果
         */
        // 将所有值以 key-value形式保存
        Map<String, List<String>> totalMap = new HashMap<>();
        totalMap.put(str_singleLineH5, singleLineH5TotalList);
        totalMap.put(str_singleLineCode, singleLineCodeTotalList);
        totalMap.put(str_multiLine, multiLineTotalList);
        totalMap.put(str_block, blockTotalList);

        // 获取 singleLineH5Result
        Map<String, List<String>> h5Map = new HashMap<>(totalMap);
        h5Map.remove(str_singleLineH5);
        List<String> singleLineH5Result = getRetainList(totalMap.get(str_singleLineH5), h5Map.values());
        System.out.println("\n singleLineH5Result <!-- --> ");
        singleLineH5Result.forEach(System.out::println);

        // 获取 singleLineCode
        Map<String, List<String>> codeMap = new HashMap<>(totalMap);
        codeMap.remove(str_singleLineCode);
        List<String> singleLineCodeResult = getRetainList(totalMap.get(str_singleLineCode), codeMap.values());
        System.out.println("\n singleLineCodeResult // ");
        singleLineCodeResult.forEach(System.out::println);

        // 获取 multiLine
        Map<String, List<String>> multiLineMap = new HashMap<>(totalMap);
        multiLineMap.remove(str_multiLine);
        List<String> multiLineResult = getRetainList(totalMap.get(str_multiLine), multiLineMap.values());
        System.out.println("\n multiLineResult /*  */ ");
        multiLineResult.forEach(System.out::println);

        // 获取 blockResult
        Map<String, List<String>> blockMap = new HashMap<>(totalMap);
        blockMap.remove(str_block);
        List<String> blockResult = getRetainList(totalMap.get(str_block), blockMap.values());
        System.out.println("\n blockResult /**  */ ");
        blockResult.forEach(System.out::println);

    }

    private List<String> getList(String str) {
        return Lists.newArrayList(str.split("\n"));
    }

    private List<String> getRetainList(List<String> retainTotalList, Collection<List<String>> notRetainTotalList) {
        List<String> aimList = retainTotalList.stream().distinct().collect(Collectors.toList());
        // 求非集
        for (List<String> notRetainList : notRetainTotalList) {
            aimList.removeAll(notRetainList);
        }
        return aimList;
    }

}
