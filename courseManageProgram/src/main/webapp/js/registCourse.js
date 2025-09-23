function validateForm() {
            const startPeriod = parseInt(document.getElementsByName('startPeriod')[0].value);
            const endPeriod = parseInt(document.getElementsByName('endPeriod')[0].value);
            
            if (startPeriod >= endPeriod) {
                alert('종료교시는 시작교시보다 뒤여야 합니다.');
                return false;
            }
            
            const maxStudent = parseInt(document.getElementById('maxStudent').value);
            if (maxStudent < 1 || maxStudent > 200) {
                alert('수용 인원은 1명 이상 200명 이하로 입력해주세요.');
                return false;
            }
            
            return true;
        }
        
        // 폼 제출 전 강의 시간 형태로 변환
        document.querySelector('form').addEventListener('submit', function(e) {
            const dayOfWeek = document.getElementsByName('dayOfWeek')[0].value;
            const startPeriod = document.getElementsByName('startPeriod')[0].value;
            const endPeriod = document.getElementsByName('endPeriod')[0].value;
            
            // 강의 시간을 "월 3,4교시" 형태로 만들어서 hidden input에 추가
            const classTime = dayOfWeek + ' ' + startPeriod + ',' + endPeriod + '교시';
			console.log(classTime);
            const hiddenInput = document.createElement('input');
            hiddenInput.type = 'hidden';
            hiddenInput.name = 'classTime';
            hiddenInput.value = classTime;
            this.appendChild(hiddenInput);
        });
		
		