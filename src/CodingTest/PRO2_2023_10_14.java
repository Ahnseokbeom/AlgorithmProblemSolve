package CodingTest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class PRO2_2023_10_14 {
	public static void main(String[] args) {
		System.out.println(solution(new String[] {"sofa red long", "blanket blue long", "towel red", "mattress long", "curtain blue long cheap"},
				new String[] {"towel", "mattress", "curtain"}));
	}
	 public static String solution(String[] products, String[] purchased) {
        Map<String, Integer> attributeCount = new HashMap<>();

        // 고객이 구매한 제품들의 특성을 카운트합니다.
        for (String product : purchased) {
            for (String productAttributes : products) {
                if (productAttributes.startsWith(product)) {
                    String[] attributes = productAttributes.split(" ");
                    for (int i = 1; i < attributes.length; i++) {
                        attributeCount.put(attributes[i], attributeCount.getOrDefault(attributes[i], 0) + 1);
                    }
                }
            }
        }

        // 특성을 기반으로 우선순위를 정합니다.
        List<String> sortedAttributes = new ArrayList<>(attributeCount.keySet());
        sortedAttributes.sort((a, b) -> {
            int countA = attributeCount.get(a);
            int countB = attributeCount.get(b);
            if (countA <= countB) {
                return Integer.compare(countA, countB);
            } else {
                return b.compareTo(a);
            }
        });

        String answer = "";
        int maxPriority = -1;

        // 고객이 구매하지 않은 제품 중에서 우선순위가 가장 높은 것을 선택합니다.
        for (String productAttributes : products) {
            boolean isPurchased = false;
            for (String purchasedProduct : purchased) {
                if (productAttributes.startsWith(purchasedProduct)) {
                    isPurchased = true;
                    break;
                }
            }
            if (!isPurchased) {
                String[] attributes = productAttributes.split(" ");
                for (String attribute : sortedAttributes) {
                    if (Arrays.asList(attributes).contains(attribute)) {
                        if (sortedAttributes.indexOf(attribute) > maxPriority) {
                            maxPriority = sortedAttributes.indexOf(attribute);
                            answer = attributes[0];
                        }
                        break;
                    }
                }
            }
        }

        return answer;
    }
}
