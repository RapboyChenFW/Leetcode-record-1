class Solution:
    def reverseBetween(self, head, m, n):
        # 如果是空的就返回None
         if not head:
            return None
        # 两个指针，移到初始反转位置，和他的前一个位置
         cur, prev = head, None
         while m > 1:
            prev = cur
            cur = cur.next
            m, n = m - 1, n - 1

         tail, con = cur, prev

         # 开始反转
         while n:
            third = cur.next
            cur.next = prev
            prev = cur
            cur = third
            n -= 1

         # Adjust the final connections as explained in the algorithm
         if con:
            con.next = prev
         else:
            head = prev
         tail.next = cur
         return head