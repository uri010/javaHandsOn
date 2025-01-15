package kr.codesquad;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class HashSetQuizTest {
    Set<String> hashSet = new HashSetQuiz().getHashSet();
    @Test
    @DisplayName("set의 크기 확인")
    public void testSetSize() {
        assertEquals(6, hashSet.size());

    }

    @Test
    @DisplayName("set에 grape 추가 ")
    public void testPlusNewFruit() {
        hashSet.add("grape");
        assertTrue(hashSet.contains("grape"));
    }

    @Test
    @DisplayName("set에 dulian 있는지 확인")
    public void testExistDulian () {
        assertTrue(hashSet.contains("dulian"));
    }

    @Test
    @DisplayName("set에 dulian 있으면 삭제")
    public void testDeleteDulian () {
        hashSet.remove("dulian");
        assertFalse(hashSet.contains("dulian"));
    }

    @Test
    @DisplayName("set의 모든 요소 출력하기")
    public void testPrintSetAllElements () {
        for (String element : hashSet) {
            System.out.println(element);
        }
        // 출력결과 예시:
        // apple
        // banana
        // ...
    }
}
