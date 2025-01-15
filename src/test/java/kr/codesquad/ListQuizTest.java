package kr.codesquad;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListQuizTest {
    List<Character> sampleList = new ListQuiz().getList();

    @Test
    @DisplayName("배열의 끝에 i를 추가해보기")
    public void test_plusI() {
        sampleList.add('i');
        assertTrue(sampleList.contains('i'));
        assertEquals('i', sampleList.get(sampleList.size() - 1));
    }

    @Test
    @DisplayName("값이 c인 배열의 인덱스 찾기")
    public void testFindValueC() {
        int answer = sampleList.indexOf('c');
        assertEquals(2, answer);
    }

    @Test
    @DisplayName("list의 여섯 번째 값은?")
    public void testSixthValue() {
        char answer = sampleList.get(5);
        assertEquals('f', answer);
    }

    @Test
    @DisplayName("배열의 길이")
    public void testLength() {
        List<Character> testList = new ListQuiz().getList();
        int answer = 8;
        assertEquals(answer, testList.size());
    }

    @Test
    @DisplayName("배열에서 첫번째 값을 삭제")
    public void testDeleteFirstValue() {
        sampleList.remove(0);
        assertFalse(sampleList.contains('e'));
    }
}