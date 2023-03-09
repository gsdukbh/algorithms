(self.webpackChunkdocs=self.webpackChunkdocs||[]).push([[8607],{6045:(n,s,a)=>{"use strict";a.r(s),a.d(s,{data:()=>p});const p={key:"v-89b460f2",path:"/leetcode/MinimumRecolors_2379.html",title:"2379. 得到 K 个黑块的最少涂色次数",lang:"zh-CN",frontmatter:{},excerpt:"",headers:[],filePathRelative:"leetcode/MinimumRecolors_2379.md",git:{updatedTime:1678373432e3,contributors:[]}}},1399:(n,s,a)=>{"use strict";a.r(s),a.d(s,{default:()=>e});const p=(0,a(6252).uE)('<h1 id="_2379-得到-k-个黑块的最少涂色次数"><a class="header-anchor" href="#_2379-得到-k-个黑块的最少涂色次数">#</a> 2379. 得到 K 个黑块的最少涂色次数</h1><p>给你一个长度为 n下标从 0开始的字符串blocks，blocks[i]要么是&#39;W&#39;要么是&#39;B&#39;，表示第i块的颜色。字符&#39;W&#39; 和&#39;B&#39;分别表示白色和黑色。</p><p>给你一个整数k，表示想要连续黑色块的数目。 每一次操作中，你可以选择一个白色块将它 涂成黑色块。 请你返回至少出现 一次连续 k个黑色块的 最少操作次数。</p><p>给你一个长度为 n 下标从 0 开始的字符串 blocks ，blocks[i] 要么是 &#39;W&#39; 要么是 &#39;B&#39; ，表示第 i 块的颜色。字符 &#39;W&#39; 和 &#39;B&#39; 分别表示白色和黑色。</p><p>给你一个整数 k ，表示想要 连续 黑色块的数目。</p><p>每一次操作中，你可以选择一个白色块将它 涂成 黑色块。</p><p>请你返回至少出现 一次 连续 k 个黑色块的 最少 操作次数。</p><p>来源：力扣（LeetCode） 链接：https://leetcode.cn/problems/minimum-recolors-to-get-k-consecutive-black-blocks 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。</p><div class="language-text ext-text line-numbers-mode"><pre class="language-text"><code>\n输入：blocks = &quot;WBBWWBBWBW&quot;, k = 7\n输出：3\n解释：\n一种得到 7 个连续黑色块的方法是把第 0 ，3 和 4 个块涂成黑色。\n得到 blocks = &quot;BBBBBBBWBW&quot; 。\n可以证明无法用少于 3 次操作得到 7 个连续的黑块。\n所以我们返回 3 。\n输入：blocks = &quot;WBWBBBW&quot;, k = 2\n输出：0\n解释：\n不需要任何操作，因为已经有 2 个连续的黑块。\n所以我们返回 0 。\n\n</code></pre><div class="line-numbers"><span class="line-number">1</span><br><span class="line-number">2</span><br><span class="line-number">3</span><br><span class="line-number">4</span><br><span class="line-number">5</span><br><span class="line-number">6</span><br><span class="line-number">7</span><br><span class="line-number">8</span><br><span class="line-number">9</span><br><span class="line-number">10</span><br><span class="line-number">11</span><br><span class="line-number">12</span><br><span class="line-number">13</span><br><span class="line-number">14</span><br></div></div><h4 id="提示"><a class="header-anchor" href="#提示">#</a> 提示</h4><ul><li>n == blocks.length</li><li>1 &lt;= n &lt;= 100</li><li>blocks[i] 要么是 &#39;W&#39; ，要么是 &#39;B&#39; 。</li><li>1 &lt;= k &lt;= n</li></ul><div class="language-java ext-java line-numbers-mode"><pre class="language-java"><code>\n<span class="token doc-comment comment">/**\n\n *\n * <span class="token keyword">@author</span> Li JiaWei\n * <span class="token keyword">@version</span> TODO\n * <span class="token keyword">@date</span> 2023/3/9\n * <span class="token keyword">@since</span> on\n */</span>\n<span class="token keyword">public</span> <span class="token keyword">class</span> <span class="token class-name">MinimumRecolors_2379</span> <span class="token punctuation">{</span>\n  \n  <span class="token keyword">public</span> <span class="token keyword">static</span> <span class="token keyword">int</span> <span class="token function">minimumRecolors</span><span class="token punctuation">(</span><span class="token class-name">String</span> blocks<span class="token punctuation">,</span> <span class="token keyword">int</span> k<span class="token punctuation">)</span> <span class="token punctuation">{</span>\n    <span class="token comment">// 这个是一个滑动窗口问题，</span>\n    <span class="token comment">// 返回一个k 少操作次数的</span>\n    <span class="token keyword">int</span> a <span class="token operator">=</span> <span class="token number">0</span><span class="token punctuation">,</span> b <span class="token operator">=</span> <span class="token number">0</span><span class="token punctuation">,</span> c <span class="token operator">=</span> <span class="token number">0</span><span class="token punctuation">;</span>\n    <span class="token keyword">while</span> <span class="token punctuation">(</span>a <span class="token operator">&lt;</span> k<span class="token punctuation">)</span> <span class="token punctuation">{</span>\n      <span class="token comment">// 前几个次数</span>\n      c <span class="token operator">+=</span> blocks<span class="token punctuation">.</span><span class="token function">charAt</span><span class="token punctuation">(</span>a<span class="token punctuation">)</span> <span class="token operator">==</span> <span class="token char">&#39;W&#39;</span> <span class="token operator">?</span> <span class="token number">1</span> <span class="token operator">:</span> <span class="token number">0</span><span class="token punctuation">;</span>\n      a<span class="token operator">++</span><span class="token punctuation">;</span>\n    <span class="token punctuation">}</span>\n    <span class="token keyword">int</span> as <span class="token operator">=</span> c<span class="token punctuation">;</span>\n    <span class="token keyword">while</span> <span class="token punctuation">(</span>a <span class="token operator">&lt;</span> blocks<span class="token punctuation">.</span><span class="token function">length</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>\n      <span class="token comment">// 右</span>\n      c <span class="token operator">+=</span> blocks<span class="token punctuation">.</span><span class="token function">charAt</span><span class="token punctuation">(</span>a<span class="token punctuation">)</span> <span class="token operator">==</span> <span class="token char">&#39;W&#39;</span> <span class="token operator">?</span> <span class="token number">1</span> <span class="token operator">:</span> <span class="token number">0</span><span class="token punctuation">;</span>\n      <span class="token comment">//左</span>\n      c <span class="token operator">-=</span> blocks<span class="token punctuation">.</span><span class="token function">charAt</span><span class="token punctuation">(</span>b<span class="token punctuation">)</span> <span class="token operator">==</span> <span class="token char">&#39;W&#39;</span> <span class="token operator">?</span> <span class="token number">1</span> <span class="token operator">:</span> <span class="token number">0</span><span class="token punctuation">;</span>\n      b<span class="token operator">++</span><span class="token punctuation">;</span>\n      a<span class="token operator">++</span><span class="token punctuation">;</span>\n      as <span class="token operator">=</span> <span class="token class-name">Math</span><span class="token punctuation">.</span><span class="token function">min</span><span class="token punctuation">(</span>as<span class="token punctuation">,</span> c<span class="token punctuation">)</span><span class="token punctuation">;</span>\n    <span class="token punctuation">}</span>\n    <span class="token keyword">return</span> as<span class="token punctuation">;</span>\n  <span class="token punctuation">}</span>\n\n  <span class="token keyword">public</span> <span class="token keyword">static</span> <span class="token keyword">void</span> <span class="token function">main</span><span class="token punctuation">(</span><span class="token class-name">String</span><span class="token punctuation">[</span><span class="token punctuation">]</span> args<span class="token punctuation">)</span> <span class="token punctuation">{</span>\n    <span class="token keyword">var</span> a <span class="token operator">=</span> <span class="token string">&quot;WBBWWBBWBW&quot;</span><span class="token punctuation">;</span>\n\n    <span class="token class-name">System</span><span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span><span class="token function">minimumRecolors</span><span class="token punctuation">(</span>a<span class="token punctuation">,</span> <span class="token number">7</span><span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">;</span>\n  <span class="token punctuation">}</span>\n<span class="token punctuation">}</span>\n\n</code></pre><div class="line-numbers"><span class="line-number">1</span><br><span class="line-number">2</span><br><span class="line-number">3</span><br><span class="line-number">4</span><br><span class="line-number">5</span><br><span class="line-number">6</span><br><span class="line-number">7</span><br><span class="line-number">8</span><br><span class="line-number">9</span><br><span class="line-number">10</span><br><span class="line-number">11</span><br><span class="line-number">12</span><br><span class="line-number">13</span><br><span class="line-number">14</span><br><span class="line-number">15</span><br><span class="line-number">16</span><br><span class="line-number">17</span><br><span class="line-number">18</span><br><span class="line-number">19</span><br><span class="line-number">20</span><br><span class="line-number">21</span><br><span class="line-number">22</span><br><span class="line-number">23</span><br><span class="line-number">24</span><br><span class="line-number">25</span><br><span class="line-number">26</span><br><span class="line-number">27</span><br><span class="line-number">28</span><br><span class="line-number">29</span><br><span class="line-number">30</span><br><span class="line-number">31</span><br><span class="line-number">32</span><br><span class="line-number">33</span><br><span class="line-number">34</span><br><span class="line-number">35</span><br><span class="line-number">36</span><br><span class="line-number">37</span><br><span class="line-number">38</span><br><span class="line-number">39</span><br><span class="line-number">40</span><br></div></div>',12),e={render:function(n,s){return p}}}}]);